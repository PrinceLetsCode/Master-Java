package leetCode;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat", "abt"};
        System.out.println(groupAnagramsOptimized(strs));
    }


    // Bruteforce solution
    // time complexity: O(n^2)
    // space complexity: O(n)
    private static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        // if strs is empty return [[""]] (empty list
        // of lists of strings)

        for (int i = 0; i < strs.length; i++) {
            List<String> anagrams = new ArrayList<>();
            anagrams.add(strs[i]);

            if (strs[i].equals("")) {
                continue;
            }
            int j = i + 1;
            while (j < strs.length) {
                if (isAnagram(strs[i], strs[j])) {
                    anagrams.add(strs[j]);
                    strs[j] = "";
                }
                j++;
            }
            result.add(anagrams);
        }

        return result;
    }

    private static boolean isAnagram(String str, String str1) {
        if (str.length() != str1.length()) {
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
            count[str1.charAt(i) - 'a']--;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    // Optimized solution
    // time complexity: O(n)
    // space complexity: O(n)

    private static List<List<String>> groupAnagramsOptimized(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] ca = new char[26];
            for (char c : s.toCharArray())
            {
                ca[c - 'a']++;
            }
            String keyStr = String.valueOf(ca);

            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
