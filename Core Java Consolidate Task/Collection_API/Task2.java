package Collection_API;

// 2. Write a Java program to iterate through all elements in an array list.


import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Iterating over colors:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
