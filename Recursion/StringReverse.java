package Recursion;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Prince Kumar";
        System.out.println(reverseString_Recursive_Functional(str, 0));
        System.out.println(reverseString_Recursive_Parameterized(str, 0, str.length() - 1));
    }

    private static String reverseString_Recursive_Parameterized(String str, int i, int i1) {
        if (i >= i1) {
            return str;
        }
        char[] chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[i1];
        chars[i1] = temp;
        return reverseString_Recursive_Parameterized(String.valueOf(chars), i + 1, i1 - 1);

    }

    private static String reverseString_Recursive_Functional(String str, int i) {
        if (i > str.length() / 2) {
            return str;
        }
        char[] chars = str.toCharArray();
        int len = str.length()-i- 1;
        char temp = chars[i];
        chars[i] = chars[len];
        chars[len] = temp;
        return reverseString_Recursive_Functional(String.valueOf(chars), i + 1);

    }

}
