package Collection_API;

// 9. Write a Java program to copy one array list into another.


import java.util.ArrayList;
import java.util.Collections;

public class Task9 {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Inception");
        movies.add("Avatar");
        movies.add("Titanic");

        ArrayList<String> copiedMovies = new ArrayList<>(movies);
        System.out.println("Original movies list: " + movies);
        System.out.println("Copied movies list: " + copiedMovies);
    }
}
