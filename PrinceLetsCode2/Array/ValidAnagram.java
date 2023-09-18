package PrinceLetsCode2.Array;

import java.util.Set;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    // brute force
    private static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        Set<Character> set = new java.util.HashSet<>();

        for(int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        for(int i = 0; i < t.length(); i++) {
            if(!set.contains(t.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
