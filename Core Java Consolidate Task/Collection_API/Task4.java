// 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
package Collection_API;


import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> carBrands = new ArrayList<>();
        carBrands.add("Volkswagen");
        carBrands.add("Lexus");
        carBrands.add("Jeep");

        int index = 2;
        String brand = carBrands.get(index);
        System.out.println("Element at index " + index + ": " + brand);
    }
}
