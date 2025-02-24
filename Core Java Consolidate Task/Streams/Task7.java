package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(56,34,32,3,21,7,6,2);

        Optional<Integer> max = numbers.stream().max(Integer::compareTo);

        Optional<Integer> min = numbers.stream().min(Integer::compareTo);

        System.out.println("Maximum value: " + max.orElse(null));
        System.out.println("Minimum value: " + min.orElse(null));
    }
}
