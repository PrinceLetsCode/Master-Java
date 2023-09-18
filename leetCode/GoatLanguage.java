package leetCode;

public class GoatLanguage {
    public static void main(String[] args) {
        String S = "I speak Goat Latin";
        System.out.println(toGoatLatin(S));
    }

    private static String toGoatLatin(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ");

        for (int i =0; i < words.length;i++) {
            String word = words[i];
            if (isVowel(word.charAt(0))) {
                result.append(word);
                result.append("ma");
                result.append("a".repeat(i + 1));
            } else {

                result.append(word.substring(1));
                result.append(word.charAt(0));
                result.append("ma");
                result.append("a".repeat(i + 1));
            }

            if (i != words.length - 1) {
                result.append(" ");
            }

        }

        return result.toString();


    }


    private static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
}
