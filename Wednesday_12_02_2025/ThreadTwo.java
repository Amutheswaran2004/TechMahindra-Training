package Thread.Wednesday_12_02_2025;

public class ThreadTwo extends Thread {
    @Override
    public void run() {
        System.out.println("From Thread Two");
        System.out.println("From Thread Two");
        System.out.println(10/0);
    }

    public static void main(String[] args) {
        ThreadTwo t2_1=new ThreadTwo();
        ThreadTwo t2_2=new ThreadTwo();
        t2_1.start();
        t2_2.run();
    }
}
