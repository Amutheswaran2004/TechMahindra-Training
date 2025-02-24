package Generics;
// 3.) Write a Java program to create a generic method that takes a list of any type and a target element. It returns
// the index of the first occurrence of the target element in the list. Return -1 if the target element cannot be
// found.

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "cherry", "banana");
        System.out.println("Index of 'banana': " + findIndex(fruits, "banana")); 
        System.out.println("Index of 'grape': " + findIndex(fruits, "grape"));

        List<Integer> numbers = List.of(10, 20, 30, 20, 40);
        System.out.println("Index of 20: " + findIndex(numbers, 20));
        System.out.println("Index of 50: " + findIndex(numbers, 50));
    }

    public static <T> int findIndex(List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
