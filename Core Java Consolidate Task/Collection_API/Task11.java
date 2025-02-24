package Collection_API;

// 11. Write a Java program to append the specified element to the end of a linked list.

import java.util.LinkedList;

public class Task11 {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        fruits.addLast("Mango"); 
        System.out.println("Updated fruits list: " + fruits);
    }
}
