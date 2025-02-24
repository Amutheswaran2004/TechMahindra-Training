package Collection_API;

// 14. Write a Java program to iterate a linked list in reverse order.


import java.util.LinkedList;
import java.util.ListIterator;

public class Task14 {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("India");
        cities.add("France");
        cities.add("America");
        cities.add("Berlin");

        System.out.println("Countries in reverse order:");
        ListIterator<String> iterator = cities.listIterator(cities.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
