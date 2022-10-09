package leetCode;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        // if the array is empty, return an empty string.
        if (strs == null || strs.length == 0) return "";

        // make a prefix string.
        StringBuilder result = new StringBuilder();

        // sort the array. this will put the shortest string at the beginning and the longest string at the end
        // also this will put all the strings in lexico-graphical order.
        Arrays.sort(strs);

        // get the first and last string from the array.
        String first = strs[0];
        String last = strs[strs.length - 1];

        // compare the first and last string.
        for (int i = 0; i < first.length() ; i++) {
            if (first.charAt(i) == last.charAt(i)) { // if the characters are equal, add it to the prefix string.
                result.append(first.charAt(i));
            } else { // if the characters are not equal, break the loop and return the prefix string.
                return result.toString();
            }
        }

        // return the prefix string.
        return result.toString();
    }

    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));

    }
}
