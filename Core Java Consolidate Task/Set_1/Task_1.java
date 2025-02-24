package Set_1;
//Write a Java program to copy the alternative elements in the array
public class Task_1 {


        public static int[] copyAlternativeElements(int[] arr) {
            int size = (arr.length + 1) / 2;
            int[] result = new int[size];

            for (int i = 0, j = 0; i < arr.length; i += 2, j++) {
                result[j] = arr[i];
            }

            return result;
        }

        public static void main(String[] args) {
            int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Example array
            int[] copied = copyAlternativeElements(original);

            System.out.println("Original Array:");
            for (int num : original) {
                System.out.print(num + " ");
            }
            System.out.println();

            System.out.println("Copied Alternative Elements:");
            for (int num : copied) {
                System.out.print(num + " ");
            }
            System.out.println();
        }


}
