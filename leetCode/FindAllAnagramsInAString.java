package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        String s = "aaaaaaaaaa";
        String p = "abc";
        System.out.println(findAnagrams_optimized(s, p));
    }


//    takes too long
    private static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        if (s.length() < p.length()) return result;

        int j = p.length() - 1;
        while (i < (s.length() - p.length()) + 1) {

            String sub = s.substring(i, j + 1);
            char[] subArr = sub.toCharArray();
            char[] pArr = p.toCharArray();
            Arrays.sort(subArr);
            Arrays.sort(pArr);
            if (Arrays.equals(subArr, pArr)) {
                result.add(i);
                i++;
                j++;
            } else {
                i++;
                j++;
            }

        }
        return result;
    }


    // optimized
    public static List findAnagrams_optimized(String s, String p) {

        int freq1[] = new int[26];
        int freq2[] = new int[26];
        List<Integer> list = new ArrayList<>();

        if(s.length()<p.length())
            return list;

        for(int i=0; i<p.length(); i++){
            freq1[s.charAt(i)-'a']++;
            freq2[p.charAt(i)-'a']++;
        }

        int start=0;
        int end=p.length();

        if(Arrays.equals(freq1,freq2))
            list.add(start);

        while(end<s.length()){

            freq1[s.charAt(start)-'a']--;
            freq1[s.charAt(end)-'a']++;

            if(Arrays.equals(freq1,freq2))
                list.add(start+1);

            start++;
            end++;
        }
        return list;
    }
}
