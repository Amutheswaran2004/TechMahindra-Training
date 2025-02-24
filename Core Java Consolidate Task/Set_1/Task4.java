package Set_1;

import java.util.Arrays;
import java.util.Scanner;

//4.) Use ArrayCopyRange() function to demonstrate and
// example such that you copy the range of values in an array
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] OriginalArray = {1,23,3,4,90,67,8,19,0};

        int[] newArray = Arrays.copyOfRange(OriginalArray, 2, 6);

        System.out.print("Sliced Array : "+Arrays.toString(newArray));
    }

}
