package leetCode;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(iValidsPalindrome(s));
    }

    private static boolean iValidsPalindrome(String s) {
        String n;
        n = s.replaceAll("[^a-zA-Z0-9]", "");
        if (n.equalsIgnoreCase(new StringBuilder(n).reverse().toString())) {
            System.out.println(n.toLowerCase());
            System.out.println(s);
            return true;
        }
        return false;
    }

    private static boolean isValidPalindrome_2(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while(head <= tail) {
            cHead = s.charAt(head);
            cTail = s.charAt(tail);
            if (!Character.isLetterOrDigit(cHead)) {
                head++;
            } else if(!Character.isLetterOrDigit(cTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                    return false;
                }
                head++;
                tail--;
            }
        }

        return true;
    }
}
