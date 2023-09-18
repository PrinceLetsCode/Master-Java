package PrinceLetsCode2.Array;

public class ValidPalindromeII {
    public static void main(String[] args) {
        System.out.println(validPalindromeBrute("abca"));
    }



    // brute force

    private static boolean validPalindromeBrute(String s) {


        int omit = 0;

        while (omit < s.length()) {

            String temp = s.substring(0, omit) + s.substring(omit + 1);

            if(isPalindrome(temp)) {
                return true;
            }

            omit++;

        }

        return false;
    }


    private static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }

            i++;
            j--;
        }

        return true;
    }



    private static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
