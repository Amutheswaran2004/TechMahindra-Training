package THREADS.Task_4;
import java.util.Arrays;
//4.) Write a Java program that performs matrix multiplication
// using multiple threads
public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        int[][] A = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] B = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] result = new int[A.length][B[0].length];

        Thread[] threads = new Thread[A.length];

        for (int i = 0; i < A.length; i++) {
            threads[i] = new Thread(new MatrixMultiplication(A, B, result, i));
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Resultant Matrix:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
