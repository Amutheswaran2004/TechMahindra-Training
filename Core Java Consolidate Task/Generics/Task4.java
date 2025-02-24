package Generics;
// 4. Write a Java program to create a generic method that takes a list of any type and returns it as a new
// list with the elements in reverse order

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<Integer> reversedList = reverseList(list);

        System.out.println("Reversed List : "+reversedList);

        List<String> Cars = List.of("Audi", "benz", "Mahindra");
        System.out.println("Reversed List: " + reverseList(Cars));
    }

    public static <T> List<T> reverseList(List<T> list) {
        List<T> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }
}
