package leetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {


    // Method 1: Brute Force.
    private static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) { // if the string is empty return 0
            return 0;
        }
        if (s.length()==1 && s == " " ){ // if the string is a space return 1
            return 1;
        }

        int maxLen=0;  // create a variable to store the max length
        for (int i = 0; i < s.length(); i++) {  // loop through the string
            String sub=String.valueOf(s.charAt(i)); // create a substring with the first character
            for (int j = i + 1; j < s.length(); j++) { // loop through the string starting from the next character
                if(sub.contains(String.valueOf(s.charAt(j)))){ // if the substring contains the character then break the loop
                    maxLen=Math.max(maxLen,sub.length()); // check if the substring length is greater than the max length
                    break;    // break the loop
                }else{  // else add the character to the substring
                    sub+=String.valueOf(s.charAt(j));  // add the character to the substring
                }
            }
        }

        return maxLen; // return the max length

    }

    // Method 2: Sliding Window.

    public static int lengthOfLongestSubstring_2(String s) {
        if (s.length() == 0) {  // if the string is empty return 0
            return 0;
        }
        if (s.length()==1 && s == " " ){  // if the string is a space return 1
            return 1;  // return 1
        }

        int maxLen=0;  //   create a variable to store the max length
        int i=0;  // create a variable to store the start index
        int j=0;  // create a variable to store the end index
        Set<Character> set=new HashSet<>();  // create a hashset to store the characters
        while(i<s.length() && j<s.length()){    // loop through the string
            if(!set.contains(s.charAt(j))){  // if the hashset does not contain the character then add it to the hashset and increment the end index
                set.add(s.charAt(j++));
                maxLen=Math.max(maxLen,j-i);        // check if the substring length is greater than the max length
            }else{
                set.remove(s.charAt(i++)); // else remove the character from the hashset and increment the start index
            }
        }
         // return the max length
        return maxLen;

    }

    public static void main(String[] args) {
        String s = "abchdlsjfd";
        System.out.println(lengthOfLongestSubstring_2(s));
    }
}
