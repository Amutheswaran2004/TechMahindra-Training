public class DivisionWithoutOperators {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        int[] result = divideWithoutOperators(dividend, divisor);
        System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);
    }

    public static int[] divideWithoutOperators(int dividend, int divisor) {
        int quotient = 0;
        int remainder = Math.abs(dividend);

        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        while (remainder >= Math.abs(divisor)) {
            remainder -= Math.abs(divisor);
            quotient++;
        }

        if ((dividend < 0) != (divisor < 0)) {
            quotient = -quotient;
        }

        return new int[]{quotient, remainder};
    }
}
