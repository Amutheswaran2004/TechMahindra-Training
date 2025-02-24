package Collection_API;

// 12. Write a Java program to iterate through all elements in a linked list.

import java.util.LinkedList;

public class Task12 {
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Japan");

        System.out.println("Countries list:");
        for (String country : countries) {
            System.out.println(country);
        }
    }
}
