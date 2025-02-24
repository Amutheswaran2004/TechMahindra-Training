package Collection_API;
// 1. Write a Java program to create an array list, add some colors (strings) and print out the collection.

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("Pakistan");
        countries.add("America");
        countries.add("China");
        countries.add("Japan");

        System.out.println("Countries: " + countries);
    }
}
