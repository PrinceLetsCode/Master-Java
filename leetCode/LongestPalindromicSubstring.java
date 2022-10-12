package leetCode;

public class LongestPalindromicSubstring {


    private static String isPalindrome(String s) {

        //if the string is empty or has only one character, then it is a palindrome.
        if (s.length()<=1) return s;


        int start = 0;  //start index of the longest palindrome.
        int end = 0;  //end index of the longest palindrome.
        for (int i = 0; i < s.length(); i++) {  //looping through the string.
            int len1=expandFromCentre(s,i,i+1); //for even length palindrome.
            int len2=expandFromCentre(s,i,i); //for odd length palindrome.

            int len = Math.max(len1, len2); //finding the maximum length of the palindrome.

            if (len > end - start) { //if the length of the palindrome is greater than the previous palindrome.
                start = i - ((len - 1) / 2); // calculating the start index of the palindrome.
                end = i + (len / 2); // calculating the end index of the palindrome.
            }
        }
        return s.substring(start, end + 1); //returning the longest palindrome.
    }

    private static int expandFromCentre(String s, int i, int i1) {
        while (i>=0 && i1<s.length() && s.charAt(i)==s.charAt(i1)) { //loop will run till the characters at i and i1 are equal and i and i1 are within the string.
            i--;    //decrementing i.
            i1++;  //incrementing i1.
        }
        return i1-i-1; //returning the length of the palindrome.
    }

    public static void main(String[] args) {

        String s = "ccbbbbccaba";
        System.out.println(isPalindrome(s));

    }
}
