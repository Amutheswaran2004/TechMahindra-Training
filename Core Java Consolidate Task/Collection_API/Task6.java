package Collection_API;

// 6. Write a Java program to remove the third element from an array list.


import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("English");
        languages.add("Spanish");
        languages.add("Japanese");
        languages.add("French");
        languages.add("Tamil");

        languages.remove(2); // Removes "C++"
        System.out.println("Updated languages list: " + languages);
    }
}
