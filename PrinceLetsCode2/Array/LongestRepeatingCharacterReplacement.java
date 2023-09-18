package PrinceLetsCode2.Array;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String str = "AABABBA";
        int k = 1;

        System.out.println(longestRepeatingCharacterReplacement(str, k));
    }


    // Brute force solution
    // Time complexity: O(n^2)
    private static int longestRepeatingCharacterReplacement(String str, int k) {
        int max = 0;

        for(int i = 0; i < str.length(); i++){
            int count = 0;
            int j = i;
            while(j < str.length()){
                if(str.charAt(i) != str.charAt(j)){
                    count++;
                }
                if(count > k){
                    break;
                }
                max = Math.max(max, j-i+1);
                j++;
            }
        }

        return max;
    }

    // Optimized solution
    // Time complexity: O(n)

    private static int longestRepeatingCharacterReplacement_optimized(String str, int k) {
        int max = 0;
       int left = 0;
       int mostFreqCharCount = 0;

       int[] charMap = new int[26];

       for(int right = 0; right < str.length(); right++){
           charMap[str.charAt(right) - 'A']++;
           mostFreqCharCount = Math.max(mostFreqCharCount, charMap[str.charAt(right) - 'A']);

           while(right - left + 1 - mostFreqCharCount > k){
               charMap[str.charAt(left) - 'A']--;
               left++;
           }

           max = Math.max(max, right - left + 1);

    }
        return max;
    }
}
