package Generics;
// 5.) Write a Java program to create a generic method that takes two lists of the same type and merges them into
// a single list. This method alternates the elements of each list.

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,2,3,4,5,6,7);
        List<Integer> list2 = List.of(90,11,33,44,55,66,77);
        List<Integer> Result = MergeAlternative(list1, list2);
        System.out.println("MergedList = "+Result);

        List<String> strList1 = List.of("A", "B", "C");
        List<String> strList2 = List.of("X", "Y", "Z");
        System.out.println("Merged String List: " + MergeAlternative(strList1, strList2));
    }

    public static <T> List<T> MergeAlternative(List<T> list1,List<T> list2){
        List<T> MergedList = new ArrayList<>();
        int i = 0 , j = 0;
            while(i<list1.size() && j < list2.size()){
                MergedList.add(list1.get(i++));
                MergedList.add(list2.get(j++));
            }
            while(i<list1.size()){
                MergedList.add(list1.get(i++));
            }
            while(j<list2.size()){
                MergedList.add(list1.get(j++));
            }
        return MergedList;
    }
}
