package Recursion;

public class PowerOfThree {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(isPowerOfThree(n));
    }

    private static boolean isPowerOfThree(int n) {
        if (n<=0) return false;
        if (n > 3) {
            if (n % 3 != 0) {
                return false;
            }
            return isPowerOfThree(n/3);
        }
        return n==1;
    }
}
