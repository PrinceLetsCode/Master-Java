package PrinceLetsCode2.revision;

public class ReverseSentenceWithoutReversingWords {
    public static void main(String[] args) {
        String sentence = "This sentence is to be reversed";
        System.out.println(reverseSentence(sentence));
    }

    private static String reverseSentence(String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = words.length-1; i >= 0; i--){
            sb.append(words[i]);
            sb.append(" ");
        }

        return sb.toString();
    }

}
