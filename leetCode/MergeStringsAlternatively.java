package leetCode;

public class MergeStringsAlternatively {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "defl";

        System.out.println(mergeAlternately(word1,word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        String ans="";
        int len=Math.max(word1.length(),word2.length());
        for(int i=0;i<len;i++)
        {
            if(i<word1.length()){
                ans+=""+word1.charAt(i);
            }
            if(i<word2.length()){
                ans+=""+word2.charAt(i);
            }
        }
        return ans;
    }
}
