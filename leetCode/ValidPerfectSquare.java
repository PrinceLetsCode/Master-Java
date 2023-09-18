package leetCode;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }

    private static boolean isPerfectSquare(int num) {

        for (int i = 1; i <= num / i ; i++) {
            if (i * i == num) {
                return true;
            }
        }

        return false;

    }

    // Another solution using binary search.

     private static boolean isPerfectSquare_optimized(int num) {
        int low = 1;
        int high = num;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return false;
     }
}
