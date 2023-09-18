package leetCode;

public class NeedleInHaystack {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));
    }

    private static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() == 0) {
            return -1;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.length() - i < needle.length()) {
                    return -1;
                }
                int j = 0;
                while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {
                    j++;
                }
                if (j == needle.length()) {
                    return i;
                }
            }
        }
        return -1;
    }

//    using sliding window
    private static int strStr_2(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() == 0) {
            return -1;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        int i = 0;
        int j = needle.length();
        while (j <= haystack.length()) {
            if (haystack.substring(i, j).equals(needle)) {
                return i;
            }
            i++;
            j++;
        }
        return -1;
    }
}
