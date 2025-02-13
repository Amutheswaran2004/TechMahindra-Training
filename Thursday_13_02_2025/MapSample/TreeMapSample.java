package Thursday_13_02_2025.MapSample;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSample {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1, "one");
        tm.put(2, "two");
        tm.put(3, "three");
        System.out.println("Initial TreeMap tm1 are : "+ tm);
        tm.put(2, "For");
        System.out.println("Updated TreeMap " + tm);
        tm.remove(1);
        System.out.println("Mappings after removal are : "
                + tm);
        System.out.println("Map traversal:");

        for (Map.Entry<Integer, String> e : tm.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());
    }
}
