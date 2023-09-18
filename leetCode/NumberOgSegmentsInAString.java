package leetCode;

public class NumberOgSegmentsInAString {
    public static void main(String[] args) {
        System.out.println(countSegments("Hello, my name is John"));
    }

    private static int countSegments(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ') {
                count++;
                while (i < s.length() && s.charAt(i) != ' ') {
                    i++;
                }
            }
        }

        return count;
    }
}
