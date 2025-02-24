package THREADS;

// 1. Write a Java program to create a basic Java thread that prints "Hello, Java!" when executed

public class Task1 extends Thread{
    public static void main(String[] args) {
        Task1 T1 = new Task1();
        T1.start();
    }
    @Override
    public void run(){
        System.out.println("Hello, Java!");
    }
}