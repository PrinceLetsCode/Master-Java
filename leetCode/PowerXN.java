package leetCode;

public class PowerXN {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        System.out.println(myPow(x, n));
    }


    // 1. Using Loop
    private static double myPow(double x, int n) {
        double result = 1;
        long newN = n;
        if (newN< 0) {
            x = 1 / x;
            newN = -newN;
        }
        while (newN > 0) {
            if (newN % 2  == 1) {
                result *= x;
                newN--;
            }
            else {
                x = x * x;
                newN = newN/ 2;
            }
        }

        return result;
    }
}
