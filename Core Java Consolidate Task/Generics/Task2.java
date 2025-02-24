package Generics;
// 2.) Write a Java program to create a generic method that takes a list of numbers and returns the sum of all the
// even and odd numbers

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        sumEvenOdd(numbers);
    }

    public static <T extends Number> void sumEvenOdd(List<T> numbers) {
        int evenSum = 0, oddSum = 0;
        for (T num : numbers) {
            int value = num.intValue();
            if (value % 2 == 0) {
                evenSum += value;
            } else {
                oddSum += value;
            }
        }
        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Sum of Odd Numbers: " + oddSum);
    }
}
