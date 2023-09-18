package PrinceLetsCode2.Array;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "sfdalshkfdhaklsfhdalkfha";

        System.out.println(longestSubstringWithoutRepeatingCharacters(str));
    }


    // Time Complexity: O(n^2); Space Complexity: O(n)
    private static int longestSubstringWithoutRepeatingCharacters(String str) {

        int i = 0;
        int j = 0;
        int max = 0;

        while(j < str.length()){
            if(!isDuplicate(str, i, j)){
                max = Math.max(max, j-i+1);
                j++;
            }else{
                i++;
            }
        }

        return max;
    }

    private static boolean isDuplicate(String str, int i, int j) {
        Set<Character> set = new HashSet<>();

        for(int k = i; k <= j; k++){
            if(set.contains(str.charAt(k))){
                return true;
            }else{
                set.add(str.charAt(k));
            }
        }

        return false;
    }


    // Time Complexity: O(n); Space Complexity: O(n)
    private static int longestSubstringWithoutRepeatingCharacters_optimized(String str) {
        int i = 0;
        int j = 0;
        int max = 0;

        Set<Character> set = new HashSet<>();

        while(j < str.length()){
            if(!set.contains(str.charAt(j))){
                set.add(str.charAt(j));
                max = Math.max(max, set.size());
                j++;
            }else{
                set.remove(str.charAt(i));
                i++;
            }
        }

        return max;
    }
}
