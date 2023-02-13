package leetCode.Interview150.Easy;

public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27)); // true
        System.out.println(isPowerOfThree(0)); // false
        System.out.println(isPowerOfThree(9)); // true
        System.out.println(isPowerOfThree(45)); // false
    }

    private static boolean isPowerOfThree(int i) {

        if (i == 0) return false;
        while (i % 3 == 0) {
            i /= 3;
        }
        return i == 1;
    }
}
