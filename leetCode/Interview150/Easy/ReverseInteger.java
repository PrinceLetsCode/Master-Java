package leetCode.Interview150.Easy;

public class ReverseInteger {

    public static int reverse(int x) {
        int rev = 0; // This is the reversed number
        while (x != 0) { // While the number is not 0
            int pop = x % 10; // Get the last digit

            // If the reversed number is greater than the max value of an integer, return 0
            // or if the reversed number is less than the min value of an integer, return 0
            if (rev > Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10) return 0;
            x /= 10; // Remove the last digit from the number
            rev = rev * 10 + pop; // Add the last digit to the reversed number
        }

        // Return the reversed number
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
