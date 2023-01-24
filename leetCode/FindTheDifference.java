package leetCode;

import java.util.Arrays;

public class FindTheDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference_optimized(s, t));
    }

    public static char findTheDifference(String s, String t) {
        // Initialize variables to store sum of ASCII codes for
        // each string
        int charCodeS = 0, charCodeT = 0;
        // Iterate through both strings and char codes
        for (int i = 0; i < s.length(); ++i) charCodeS += s.charAt(i);
        for (int i = 0; i < t.length(); ++i) charCodeT += t.charAt(i);
        // Return the difference between 2 strings as char
        return (char)(charCodeT - charCodeS);
    }

    public static char findTheDifference_optimized(String s, String t) {
        int sum = 0;
        int i=0;
        while (i<s.length()) {
            sum += (t.charAt(i) - s.charAt(i));
            i++;
        }
        sum += t.charAt(i);

        return (char)(sum);
    }
}
