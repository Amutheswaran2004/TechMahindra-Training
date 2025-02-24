package Collection_API;

// 19. Write a Java program to insert some elements at the specified position into a linked list.


import java.util.LinkedList;
import java.util.Arrays;

public class Task19 {
    public static void main(String[] args) {
        LinkedList<String> movies = new LinkedList<>();
        movies.add("Inception");
        movies.add("Titanic");
        movies.add("Avatar");

        movies.addAll(1, Arrays.asList("Interstellar", "The Dark Knight")); // Inserts at index 1
        System.out.println("Updated movies list: " + movies);
    }
}
