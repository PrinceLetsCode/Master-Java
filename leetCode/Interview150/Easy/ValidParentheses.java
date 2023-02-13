package leetCode.Interview150.Easy;

import java.util.Stack;

public class ValidParentheses {

    private static boolean isValid_bruteForce(String s) {
        if (s.length()==0 || s.length()%2!=0) return false;

        boolean flag=true;

        for (int i = 0; i < s.length()-1; i++) {

                    if (s.charAt(i)=='(' && s.contains(")") || s.charAt(i)==')' && s.contains("("))  {
                        flag=true;
                    } else if (s.charAt(i)=='{' && s.contains("}") || s.charAt(i)=='}' && s.contains("{")) {
                        flag=true;
                    } else if (s.charAt(i)=='[' && s.contains("]")  || s.charAt(i)==']' && s.contains("[")) {
                        flag=true;
                    } else {
                        flag=false;
                    }


        }


        return flag;
    }

    public static boolean isValid(String s) {
        if (s.length()==0 || s.length()%2!=0) return false;

        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }


}
