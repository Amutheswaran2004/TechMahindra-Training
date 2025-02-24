package Collection_API;

// 7. Write a Java program to search for an element in an array list.


import java.util.ArrayList;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<String> sports = new ArrayList<>();
        sports.add("Cricket");
        sports.add("Football");
        sports.add("Tennis");
        sports.add("Hockey");

        String searchSport = "Tennis";
        if (sports.contains(searchSport)) {
            System.out.println(searchSport + " is in the list.");
        } else {
            System.out.println(searchSport + " is not in the list.");
        }
    }
}
