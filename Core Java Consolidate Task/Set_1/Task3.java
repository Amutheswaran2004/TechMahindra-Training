package Set_1;

import java.util.Arrays;
//3.) Demonstrate with an example with the
// difference between equals() vs deepEquals() method?
public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = arr1;

        System.out.println("---- 1D Array Comparison ----");
        System.out.println("arr1.equals(arr2): " + arr1.equals(arr2));
        System.out.println("Arrays.equals(arr1, arr2): " + Arrays.equals(arr1, arr2));
        System.out.println("arr1.equals(arr3): " + arr1.equals(arr3));

        int[][] deepArr1 = {{1, 2}, {3, 4}};
        int[][] deepArr2 = {{1, 2}, {3, 4}};
        int[][] deepArr3 = deepArr1;

        System.out.println("\n---- 2D Array Comparison ----");
        System.out.println("deepArr1.equals(deepArr2): " + deepArr1.equals(deepArr2));
        System.out.println("Arrays.equals(deepArr1, deepArr2): " + Arrays.equals(deepArr1, deepArr2));

        System.out.println("Arrays.deepEquals(deepArr1, deepArr2): " + Arrays.deepEquals(deepArr1, deepArr2));
        System.out.println("deepArr1.equals(deepArr3): " + deepArr1.equals(deepArr3));
    }
}

