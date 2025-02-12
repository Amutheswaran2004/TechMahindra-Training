package Thread.Wednesday_12_02_2025;

public class ThreadOne extends Thread {
    @Override
    public void run() {
        System.out.println("From Thread One");
        System.out.println("From Thread One");
        System.out.println("From Thread One");
    }
    public static void main(String[] args) {
        ThreadOne t1 =new ThreadOne();
        t1.start();
    }
}
