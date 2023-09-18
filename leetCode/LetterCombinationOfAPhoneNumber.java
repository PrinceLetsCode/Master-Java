package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfAPhoneNumber {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
        
    }

    private static List<String> letterCombinations(String number) {
        List<String> answer = new ArrayList<>();
        if (number.length() == 0) {
            return answer;
        }

        String[] letters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return letterCombinations(number, letters, answer, 0, "");
    }

    private static List<String> letterCombinations(String number, String[] letters, List<String> answer, int index, String output) {
        if (index == number.length()) {
            answer.add(output);
            return answer;
        }

        String letter = letters[number.charAt(index) - '0'];
        for (int i = 0; i < letter.length(); i++) {
            letterCombinations(number, letters, answer, index+1, output+letter.charAt(i));
        }
        return answer;
    }
}
