package Generics;
// 1).Write a Java program to create a generic method that takes two arrays of the same type and checks if they
// have the same elements in the same order
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Integer[] arr1 = { 1, 2, 3, 4, 5 };
        Integer[] arr2 = { 1, 2, 3, 4, 5 };
        Integer[] arr3 = { 1, 2, 3, 5, 4 };

        System.out.println("arr1 & arr2 same? " + compareArrays(arr1, arr2));
        System.out.println("arr1 & arr3 same? " + compareArrays(arr1, arr3));

        String[] str1 = { "red", "black", "blue" };
        String[] str2 = { "red", "black", "blue" };
        String[] str3 = { "red", "black", "blue" };

        System.out.println("str1 & str2 same? " + compareArrays(str1, str2));
        System.out.println("str1 & str3 same? " + compareArrays(str1, str3));
    }

    public static <T> boolean compareArrays(T[] arr1, T[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
}
