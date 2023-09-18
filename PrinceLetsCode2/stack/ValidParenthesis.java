package PrinceLetsCode2.stack;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("[({})]"));
    }


    // brute force
    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();

        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if(ch == ')' && top != '(') {
                    return false;
                }
                if(ch == '}' && top != '{') {
                    return false;
                }
                if(ch == ']' && top != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();


    }
}
