package Thread.Wednesday_12_02_2025;

public class ThreadRunnableTwo implements Runnable{
    @Override
    public void run() {
        System.out.println("From ThreadRunnableTwo");
        System.out.println("From ThreadRunnableTwo");
    }

    public static void main(String[] args) {

        Thread tr_2=new Thread(new ThreadRunnableTwo());


        tr_2.start();
    }
}
