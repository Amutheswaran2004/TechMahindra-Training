package THREADS;

// 2.) Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20

public class Task2 {
    public static void main(String[] args) {
        Thread evenNumber = new Thread(new EvenNumber());
        Thread oddNumber = new Thread(new OddNumber());
        evenNumber.start();
        oddNumber.start();
    }
}

class OddNumber implements Runnable{
    @Override
    public void run(){
        for(int i = 1 ; i <= 20 ; i += 2){
            System.out.println("Odd Number "+i);
        }
    }
}
class EvenNumber implements Runnable{
    @Override
    public void run(){
        for(int i = 2 ; i <= 20 ; i += 2){
            System.out.println("Even Number "+i);
        }
    }
}
