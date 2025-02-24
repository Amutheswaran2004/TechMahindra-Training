package Collection_API;

// 8. Write a Java program to sort a given array list.


import java.util.ArrayList;
import java.util.Collections;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<String> desserts = new ArrayList<>();
        desserts.add("Cake");
        desserts.add("Ice Cream");
        desserts.add("Brownie");
        desserts.add("Donut");

        Collections.sort(desserts);
        System.out.println("Sorted desserts list: " + desserts);
    }
}
