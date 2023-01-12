package Recursion;

public class GCDusingEuclidAlgo {
    public static void main(String[] args) {
        System.out.println(calculate_gcd(255,867));
    }

    private static int calculate_gcd(int number1, int number2) {
        int rem=number1%number2;
        if (rem == 0) {
            return number2;
        }
        return calculate_gcd(number2, rem);
    }
}
