package Collection_API;

// 16. Write a Java program to insert elements into the linked list at the first and last positions.

import java.util.LinkedList;

public class Task16 {
    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();
        languages.add("Python");
        languages.add("JavaScript");

        languages.addFirst("Java"); 
        languages.addLast("C++");

        System.out.println("Updated languages list: " + languages);
    }
}
