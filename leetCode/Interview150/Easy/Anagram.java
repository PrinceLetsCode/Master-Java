package leetCode.Interview150.Easy;

import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) { // if the length of the two strings are not equal then they are not anagrams
            return false;
        }
        // convert the two strings to character arrays
        Arrays.sort(s.toCharArray());
        Arrays.sort(t.toCharArray());

        // compare the two character arrays
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) { // if the characters are not equal then they are not anagrams
                return false;
            }
        }
        // if the characters are equal then they are anagrams
        return true;
    }
    public static void main(String[] args) {


    }
}
