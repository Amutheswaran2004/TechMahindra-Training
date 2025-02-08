package Utility;
public class Utility {
    public static int findLengthOfInteger(int num) {
        if (num == 0) {
            return 1;
        }
        int length = 0;
        while (num != 0) {
            num /= 10;
            length++;
        }
        return length;
    }
}

