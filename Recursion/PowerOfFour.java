package Recursion;

public class PowerOfFour {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfFour(n));
    }

    private static boolean isPowerOfFour(int n) {
        if (n<=0 ||n==2 || n==3) return false;
        if (n > 4) {
            if (n % 4 != 0) {
                return false;
            }
            return isPowerOfFour(n/4);
        }
        return true;
    }

}
