package Collection_API;

// 13. Write a Java program to iterate through all elements in a linked list starting at the specified position.


import java.util.LinkedList;

public class Task13 {
    public static void main(String[] args) {
        LinkedList<String> books = new LinkedList<>();
        books.add("Harry Potter");
        books.add("The Hobbit");
        books.add("1984");
        books.add("Pride and Prejudice");

        int startIndex = 2;
        System.out.println("Books from index " + startIndex + ":");
        for (int i = startIndex; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }
}
