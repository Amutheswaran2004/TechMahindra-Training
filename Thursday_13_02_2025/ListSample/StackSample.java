package Thursday_13_02_2025.ListSample;

import java.util.List;
import java.util.Stack;

public class StackSample extends Thread {
    @Override
    public void run() {
        List<Integer> list = new Stack<>();
        System.out.println("Is list empty? "+list.isEmpty());
        list.add(32);
        list.add(24);
        list.add(68);
        list.add(12);
        list.add(87);
        list.add(50);
        System.out.println("Is list empty? "+list.isEmpty());
        System.out.println("The given list is:"+list);
        System.out.println("Number of elements in the list: " + list.size());
        list.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :" + list);
        System.out.println("The number of elements in the list: " + list.size());
        System.out.println("Is 566 available in the list:" + list.contains(566));
        System.out.println("The given list before removing elements is :" + list);
        list.remove(2);
        list.remove(3);
        System.out.println("After removing elements:");
        System.out.println("The given list is :" + list);
        System.out.println("The number of elements in the list: " + list.size());
    }
    }

