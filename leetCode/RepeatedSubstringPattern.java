package leetCode;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(repeatedSubstringPattern(s));
    }

    private static boolean repeatedSubstringPattern(String s) {
        int m = s.length();
        for (int i = 1; i < m / 2; i++) {
            String sub = s.substring(0, i);
            if(isConstructible(sub, s)) return true;
        }
        return false;
    }

    private static boolean isConstructible(String sub, String s) {
        int m = s.length();
        int n = sub.length();
        if (m % n != 0) return false;
        int i = 0;
        while (i < m) {
            if (!sub.equals(s.substring(i, i + n))) return false;
            i += n;
        }
        return true;
    }
}
