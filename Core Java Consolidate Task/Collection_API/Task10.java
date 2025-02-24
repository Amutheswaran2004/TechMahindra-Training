package Collection_API;

// 10. Write a Java program to shuffle elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

public class Task10 {
    public static void main(String[] args) {
        ArrayList<String> beverages = new ArrayList<>();
        beverages.add("Tea");
        beverages.add("Coffee");
        beverages.add("Juice");
        beverages.add("Soda");

        Collections.shuffle(beverages);
        System.out.println("Shuffled beverages list: " + beverages);
    }
}
