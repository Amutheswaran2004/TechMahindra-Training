package Collection_API;

// 15. Write a Java program to insert the specified element at the specified position in the linked list.

import java.util.LinkedList;

public class Task15 {
    public static void main(String[] args) {
        LinkedList<String> gadgets = new LinkedList<>();
        gadgets.add("Phone");
        gadgets.add("Tablet");
        gadgets.add("Laptop");

        gadgets.add(1, "Smartwatch"); 
        System.out.println("Updated gadgets list: " + gadgets);
    }
}
