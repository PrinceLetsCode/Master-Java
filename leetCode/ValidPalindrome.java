package leetCode;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        int i = 0;
        while (i < s.length() / 2) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    private static boolean isPalindrome_2(String s) {
        if (s.length() == 0) {
            return true;
        }
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
