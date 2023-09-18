package Bit_manipulation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeyboardRow {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] result = findWords(words);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static String[] findWords(String[] words) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        List<String> result = new java.util.ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            int firstRowCounter = 0;
            int secondRowCounter = 0;
            int thirdRowCounter = 0;
            for (int j = 0; j < word.length(); j++) {
                if (firstRow.contains(word.charAt(j) + "")) {
                    firstRowCounter++;
                } else if (secondRow.contains(word.charAt(j) + "")) {
                    secondRowCounter++;
                } else if (thirdRow.contains(word.charAt(j) + "")) {
                    thirdRowCounter++;
                }
            }
            if (firstRowCounter == word.length() || secondRowCounter == word.length() || thirdRowCounter == word.length()) {
                result.add(words[i]);
            }
        }

        return result.toArray(new String[result.size()]);
    }



    // optimized solution
    private static String[] findWords_2(String[] words) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        Set<Character> firstRowSet = new HashSet<>();
        Set<Character> secondRowSet = new HashSet<>();
        Set<Character> thirdRowSet = new HashSet<>();

        for(int i = 0;i<firstRow.length();i++){
            firstRowSet.add(firstRow.charAt(i));
        }

        for(int i = 0;i<secondRow.length();i++){
            secondRowSet.add(secondRow.charAt(i));
        }

        for(int i = 0;i<thirdRow.length();i++){
            thirdRowSet.add(thirdRow.charAt(i));
        }

        List<String> result = new java.util.ArrayList<>();



        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            int firstRowCounter = 0;
            int secondRowCounter = 0;
            int thirdRowCounter = 0;
            for (int j = 0; j < word.length(); j++) {
                if (firstRowSet.contains(word.charAt(j))) {
                    firstRowCounter++;
                } else if (secondRowSet.contains(word.charAt(j))) {
                    secondRowCounter++;
                } else if (thirdRowSet.contains(word.charAt(j))) {
                    thirdRowCounter++;
                }
            }
            if (firstRowCounter == word.length() || secondRowCounter == word.length() || thirdRowCounter == word.length()) {
                result.add(words[i]);
            }
        }


        return result.toArray(new String[result.size()]);


    }
}
