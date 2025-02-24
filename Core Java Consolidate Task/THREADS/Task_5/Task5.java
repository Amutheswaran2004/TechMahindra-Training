package THREADS.Task_5;

import java.util.Scanner;

//5.) Write a Java program that calculates the sum of all prime numbers
//up to a given limit using multiple threads
public class Task5 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = scan.nextInt();

        int numThreads = 4;
        PrimeSumThread[] threads = new PrimeSumThread[numThreads];
        int range = limit / numThreads;
        int start = 2;

        for (int i = 0; i < numThreads; i++) {
            int end = (i == numThreads - 1) ? limit : start + range - 1;
            threads[i] = new PrimeSumThread(start, end);
            threads[i].start();
            start = end + 1;
        }

        int totalSum = 0;
        for (PrimeSumThread thread : threads) {
            thread.join();
            totalSum += thread.getSum();
        }

        System.out.println("Sum of prime numbers up to " + limit + " is: " + totalSum);
    }
}

