package Thread.Wednesday_12_02_2025;

public class ThreadRunnableOne implements Runnable{
    @Override
    public void run() {
        System.out.println("Frome ThreadRunnableOne");
        System.out.println("Frome ThreadRunnableOne");
    }

    public static void main(String[] args) {
        Thread tr_1=new Thread(new ThreadRunnableOne());
        tr_1.start();
    }

}
