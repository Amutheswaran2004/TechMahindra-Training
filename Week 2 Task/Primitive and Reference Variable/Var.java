public class Var {
    public static void main(String[] args) {
        int num = 5;
        int[] arr = {1, 2, 3};

        System.out.println("Before calling the method:");
        System.out.println("Integer: " + num);
        System.out.println("Array: " + arr[0] + ", " + arr[1] + ", " + arr[2]);

        modifyValues(num, arr);

        System.out.println("\nAfter calling the method:");
        System.out.println("Integer: " + num);
        System.out.println("Array: " + arr[0] + ", " + arr[1] + ", " + arr[2]);
    }

    public static void modifyValues(int num, int[] arr) {
        num = 10;
        arr[0] = 100;
    }
}
