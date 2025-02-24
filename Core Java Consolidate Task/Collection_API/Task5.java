package Collection_API;

// 5. Write a Java program to update an array element by the given element.

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");

        cities.set(2, "Dubai");
        System.out.println("Updated cities list: " + cities);
    }
}
