package leetCode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        System.out.println(isIsomorphic(s, t));
    }

    private static boolean isIsomorphic(String s, String t) {

//        check if the length of s and t are equal
        if (s.length() != t.length()) return false;

        //  create a map to store the mapping of characters
        Map<Character, Character> map = new HashMap<>();

        //  iterate through the string
        for (int i = 0; i < s.length(); i++) {
            //  get the current character of s and t
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            //  check if the map contains the key
            if (map.containsKey(c1)) {
                //  check if the value of the key is equal to the current character of t ( previously mapped )
                if (map.get(c1) != c2) return false;
            } else {
                //  check if the map contains the value
                if (map.containsValue(c2)) return false;
                map.put(c1, c2);
            }
        }

        return true;
    }
}
