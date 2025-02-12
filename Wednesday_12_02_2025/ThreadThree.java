package Thread.Wednesday_12_02_2025;

public class ThreadThree extends Thread {
    @Override
    public void run() {
        System.out.println("From ThreadThree");
        System.out.println("From ThreadThree");
        System.out.println("From ThreadThree");
        System.out.println("From ThreadThree");
        System.out.println("From ThreadThree");
    }

    public static void main(String[] args) {
        ThreadThree t3_1=new ThreadThree();
        ThreadThree t3_2=new ThreadThree();
        ThreadThree t3_3=new ThreadThree();
        t3_1.start();
        t3_2.start();
        t3_3.start();
    }
}
