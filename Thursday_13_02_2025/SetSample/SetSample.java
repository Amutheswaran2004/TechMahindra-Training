package Thursday_13_02_2025.Task_1.SetSample;

import java.util.*;

public class SetSample {
    //Execute and see
    //HashSet
    //LinkedHashSet
    //TreeSet
    //HashSet - Integer
    //LinkedHashSet - String
    //TreeSet - Float
    public static void setSample(HashSet<Integer> hs){
        hs.add(12);
        hs.add(14);
        hs.add(28);
        hs.add(43);
        hs.add(65);
        hs.add(21);
        hs.add(49);
        hs.add(50);
        System.out.println("HashSet Size: " + hs.size());
        System.out.println("Elements in HashSet: " + hs);
        System.out.print("Using iterator : ");
        Iterator<Integer> iterator = hs.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
        System.out.print("Using enhanced for loop : ");
        for (Integer element : hs)
            System.out.print(element + " ");
        hs.remove(65);
        System.out.println("\nHashSet after removing element : " + hs);
        for (Integer element : hs)
            System.out.print(element + " ");
        System.out.println("\nElements divisible by Seven");
        for (Integer element : hs)
        {   if(element%7==0)
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void setSample(LinkedHashSet<String> lhs){
        lhs.add("AMUDESH");
        lhs.add("BROWNIE");
        lhs.add("ABCD");
        lhs.add("SPANISH");
        lhs.add("AIA");
        lhs.add("MDABZERY");
        lhs.add("B");
        lhs.add("AN");
        System.out.println("LinkedHashSet Size: " + lhs.size());
        System.out.println("Elements in HashSet: " + lhs);
        System.out.print("Using iterator : ");
        Iterator<String> iterator = lhs.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
        System.out.print("Using enhanced for loop : ");
        for (String element : lhs)
            System.out.print(element + " ");
        lhs.remove("B");
        System.out.print("\nLinkedHashSet after removing element : " + lhs);
        System.out.print("\nElements with size more than five :");
        for (String element : lhs) {
            if(element.length()>5)
             System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void setSample(TreeSet<Double> ts){
        ts.add(21.3);
        ts.add(43.1);
        ts.add(2.0);
        ts.add(47.5);
        ts.add(18.9);
        ts.add(32.9);
        ts.add(9.9);
        ts.add(7.3);
        System.out.println("TreeSet Size: " + ts.size());
        System.out.println("Elements in TreeSet: " + ts);
        System.out.print("Using iterator : ");
        Iterator<Double> iterator = ts.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
        System.out.print("Using enhanced for loop : ");
        for (Double element : ts)
            System.out.print(element + " ");
        ts.remove(9.9);
        System.out.println("\nTreeSet after removing element : " + ts);
        System.out.print("Elements which is greater than 20 :");
        for (Double element : ts) {
            if(element>20.0)
             System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        setSample(hs);
        System.out.println("----------------------------------------------------");
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        setSample(lhs);
        System.out.println("----------------------------------------------------");
        TreeSet<Double> ts = new TreeSet<>();
        setSample(ts);
        System.out.println("----------------------------------------------------");
    }
}
