package PrinceLetsCode2.Array;

public class ValidPalindrome {
    public static void main(String[] args) {

        String S = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(S));

    }

    private static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;

while(i < j) {
            if(!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }

            if(!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }

            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
