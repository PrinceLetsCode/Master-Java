package PrinceLetsCode2.Array;

public class KeyboardRow {
    public static void main(String[] args) {
        String[] arr = {"Hello", "Alaska", "Dad", "Peace"};
        for(String s : findWords(arr)) {
            System.out.print(s + " ");
        }
    }

    private static String[] findWords(String[] arr) {
       String row1 = "qwertyuiop";
         String row2 = "asdfghjkl";
            String row3 = "zxcvbnm";

            java.util.List<String> list = new java.util.ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i].toLowerCase();

            int first = 0;
            int second = 0;
            int third = 0;

            for (int j = 0; j < word.length(); j++) {
                if (row1.contains(word.charAt(j) + "")) {
                    first++;
                } else if (row2.contains(word.charAt(j) + "")) {
                    second++;
                } else if (row3.contains(word.charAt(j) + "")) {
                    third++;
                }
            }

            if (first == word.length() || second == word.length() || third == word.length()) {
                list.add(arr[i]);
            }
        }

        return list.toArray(new String[list.size()]);
    }
}
