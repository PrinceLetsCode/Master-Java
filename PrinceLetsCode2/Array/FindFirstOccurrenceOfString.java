package PrinceLetsCode2.Array;

public class FindFirstOccurrenceOfString {
    public static void main(String[] args) {
        String str = "abc";
        String target = "c";

        System.out.println(findFirstOccurrence(str, target));
    }

    private static int findFirstOccurrence(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;

        int i  = 0;
        int j =  i + needle.length();

        while(j <= haystack.length()){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
            i++;
            j++;
        }

        return -1;
    }
}
