package PrinceLetsCode2.Array;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class GroupAnagram {

    public static void main(String[] args) {
        
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams2(strs));
        
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];
            List<String> list = new ArrayList<>();
            if (word.equals("")) {
                continue;
            }
            list.add(word);
            for (int j = i+1; j<strs.length;j++) {
                if (strs[j].equals("")) {
                    continue;
                }
                String word2 = strs[j];
                if (isAnagram(word, word2)) {
                    list.add(word2);
                    strs[j] = "";
                }
            }

            if (list.size() > 0) {
                result.add(list);
            }
        }
        return result;
    }

    private static boolean isAnagram(String word, String word2) {
        if (word.length() != word2.length()) {
            return false;
        }
        int[] arr = new int[26];
        for (int i = 0; i < word.length(); i++) {
            arr[word.charAt(i) - 'a']++;
            arr[word2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }



    // optimized solution
    private static List<List<String>> groupAnagrams2(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs) {
            char[] arr = new char[26];
            for(int i = 0; i < s.length(); i++) {
                arr[s.charAt(i) - 'a']++;
            }
            String key = new String(arr);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());


    }
}
