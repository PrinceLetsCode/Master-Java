package PrinceLetsCode2.general;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    private static boolean isPalindrome(int x) {
if(x < 0) {
            return false;
        }

        int temp = x;
        int reverse = 0;

        while(temp > 0) {
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp /= 10;
        }

        return reverse == x;

    }
}
