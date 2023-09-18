package PrinceLetsCode2.Array;

import java.util.HashSet;
import java.util.Set;

public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println(checkInclusion(s1, s2));
    }

    private static boolean checkInclusion(String s1, String s2) {

        int[] charMap = new int[26];

        for(char c : s1.toCharArray()){
            charMap[c-'a']++;
        }

        int i = 0;
        int j = i + s1.length();

        while(j <= s2.length()){
            String subString = s2.substring(i,j);
            int[] subStringCharMap = new int[26];

            for(char c : subString.toCharArray()){
                subStringCharMap[c-'a']++;
            }

            if(isPermutation(charMap, subStringCharMap)){
                return true;
            }

            i++;
            j++;
        }

        return false;

    }

    private static boolean isPermutation(int[] charMap, int[] subStringCharMap) {
        for(int i = 0; i < 26; i++){
            if(charMap[i] != subStringCharMap[i]){
                return false;
            }
        }

        return true;
    }


    // Time Complexity: O(n); Space Complexity: O(n)
    private static boolean checkInclusion_optimized(String s1, String s2) {
        int[] s1Map = new int[26];
        int[] currWindowMap = new int[26];

        for(char c : s1.toCharArray()){
            s1Map[c-'a']++;
        }

        int start = 0;
        int end = 0;

        while(end < s2.length()){
            currWindowMap[s2.charAt(end)-'a']++;

            int windowSize = end-start+1;

            if(windowSize== s1.length()){
                if(isPermutation(s1Map, currWindowMap)){
                    return true;
                }
            }

            if (windowSize < s1.length()) {
                end++;
            }else{
                currWindowMap[s2.charAt(start)-'a']--;
                start++;
                end++;
            }
        }

        return false;
    }



}
