package PrinceLetsCode2.Array;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(reverseVowels(str));
    }

    private static String reverseVowels(String s) {
        char[] characters = s.toCharArray();

        int i = 0;
        int j = s.length()-1;

        while( i < j){
            while(!isVowel(characters[i]) && i < j){
                i++;
            }

            while(!isVowel(characters[j])  && i < j){
                j--;
            }


            char temp= characters[i];
            characters[i] = characters[j];
            characters[j] = temp;

            i++;
            j--;
        }

        return String.valueOf(characters);
    }

    private static boolean isVowel(char character) {
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
                character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U';
    }
}
