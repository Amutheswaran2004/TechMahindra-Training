package JDBC;

class SharedBuffer {
    private int data;
    private boolean available = false;

    public synchronized void produce(int data) throws InterruptedException {
        while (available) {
            wait();
        }
        this.data = data;
        System.out.println("Produced: " + data);
        available = true;
        notify();  
    }

    public synchronized int consume() throws InterruptedException {
        while (!available) {
            wait(); 
        }
        available = false;
        System.out.println("Consumed: " + data);
        notify(); 
        return data;
    }
}

class Producer extends Thread {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.produce(i);
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Consumer extends Thread {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.consume();
                Thread.sleep(1500); 
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Task2 {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
