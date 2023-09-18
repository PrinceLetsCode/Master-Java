package PrinceLetsCode2.stack;

public class FindMaximumNumberOfStringPairs {
    public static void main(String[] args) {
        String[] arr = {"ab","ba","cd","dc","ef","fe","gh","hg","ij","ji","kl","lk","mn","nm","op","po"};
        System.out.println(maximumNumberOfPairs(arr));
    }


    // brute force. Time complexity: O(n^2)
    private static int maximumNumberOfPairs(String[] words) {
        int n = words.length;
        int count = 0;

        for (int i = 0; i < n;i++){
            String word1 = words[i];
            for (int j = i+1; j < n; j++){
                String word2 = words[j];
                if(word1.charAt(0) == word2.charAt(1) && word1.charAt(1) == word2.charAt(0)){
                    count++;
                    break;
                }
            }
        }

        return count;
    }
    
}
