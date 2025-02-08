public class Factnum {
    public static void main(String[] args) {
        int num = 100;
        int trailingZeroes = findTrailingZeroes(num);
        System.out.println("Trailing zeroes in " + num + "! are: " + trailingZeroes);
    }

    public static int findTrailingZeroes(int n) {
        int count = 0;
        for (int i = 5; i <= n; i *= 5) {
            count += n / i;
        }
        return count;
    }
}
