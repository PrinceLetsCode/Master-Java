package Bit_manipulation;

public class PerfectNumber {
    public static void main(String[] args) {
        int n = 28;
        System.out.println(isPerfectNumberOptimized(n));
    }

    private static boolean isPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= num / 2 + 1; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return num == sum;
    }

    // optimized solution

    private static boolean isPerfectNumberOptimized(int num) {
        if (num <= 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i;
                }
            }
        }
        return sum - num == num;
    }
}
