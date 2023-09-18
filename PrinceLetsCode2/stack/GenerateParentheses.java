package PrinceLetsCode2.stack;
import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(generateParenthesis(n));
    }




    // brute force. Time complexity: O(2^n)
    private static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);

        return result;
    }

    private static void backtrack(List<String> result, String s, int open, int close, int n) {
        if(open == n && close == n){
            result.add(s);
            return;
        }
        if (open < n){
            backtrack(result, s+"(", open+1, close, n);
        }
        if (close < open){
            backtrack(result, s+")", open, close+1, n);
        }
    }
}
