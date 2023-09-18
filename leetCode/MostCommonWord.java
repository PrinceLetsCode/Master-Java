package leetCode;

import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        
        System.out.println(mostCommonWord(paragraph, banned));
    }

    private static String mostCommonWord(String paragraph, String[] banned) {
        String [] words = paragraph.toLowerCase().split("\\W+"); // \\W+ means one or more non-word characters
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            if (!map.containsKey(words[i])) {
                map.put(words[i], 1);
            } else {
                map.put(words[i], map.get(words[i]) + 1);
            }
        }

        for (int i = 0; i < banned.length; i++) {
            if (map.containsKey(banned[i])) {
                map.remove(banned[i]);
            }
        }

        int max = 0;
        String result = "";

        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                result = key;
            }
        }

        return result;

    }


}
