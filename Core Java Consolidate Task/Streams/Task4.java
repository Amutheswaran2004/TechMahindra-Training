package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(56,34,32,56,3,21,7,7,6,2);

        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Original List: " + numbers);
        System.out.println("List without duplicates: " + uniqueNumbers);
    }
}
