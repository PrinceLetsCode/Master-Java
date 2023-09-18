package leetCode;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }

    private static String reverseVowels(String leetcode) {
        char[] chars = leetcode.toCharArray();
        int i = 0;
        int j = chars.length - 1;

        while (i < j) {
            if (isVowel(chars[i]) && isVowel(chars[j])) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            } else if (isVowel(chars[i])) {
                j--;
            } else if (isVowel(chars[j])) {
                i++;
            } else {
                i++;
                j--;
            }
        }

        return new String(chars);
    }

    private static boolean isVowel(char aChar) {
        return aChar == 'a' || aChar == 'e' || aChar == 'i' || aChar == 'o' || aChar == 'u' ||
                aChar == 'A' || aChar == 'E' || aChar == 'I' || aChar == 'O' || aChar == 'U';
    }
}
