package leetCode;

public class DivideTwoIntegers {
    public static void main(String[] args) {
        System.out.println(divide_bitManipulation(43, -5));
    }


    // Brute Force
    private static int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int quotient = 0;
        while(dividend - divisor >= 0) {
            dividend -= divisor;
            quotient++;
        }

        return sign * quotient;
    }

    // using bit manipulation

    private static int divide_bitManipulation(int dividend, int divisor) {

        if(dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int quotient = 0;
        while(dividend - divisor >= 0) {
            int x = 0;
            while(dividend - (divisor << 1 << x) >= 0) {
                x++;
            }
            quotient += 1 << x;
            dividend -= divisor << x;
        }

        return sign * quotient;
    }
}
