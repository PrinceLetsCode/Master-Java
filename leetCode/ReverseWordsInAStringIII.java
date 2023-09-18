package leetCode;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();


        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (j < s.length() && s.charAt(j) != ' ') {
                j++;
            }
            sb.append(reverse(s.substring(i, j)));
            if (j < s.length()) {
                sb.append(" ");
            }
            i = j+1;
        }

        return sb.toString();
    }

    private static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

}
