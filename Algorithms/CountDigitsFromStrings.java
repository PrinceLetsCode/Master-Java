package Algorithms;

public class CountDigitsFromStrings {

    public static void countPosNegZeroFromString(String str) {
        int pos = 0, neg = 0, zero = 0;

        int i=0;
        while (i<str.length()) {
            if (str.charAt(i) == '-') {
                neg++;
                i=i+2;
                continue;
            } else if (str.charAt(i) >= '1' && str.charAt(i) <= '9') {
                pos++;

            }
            else {
                zero++;
            }
            i++;
        }
        System.out.println("Positive: " + pos + " Negative: " + neg + " Zero: " + zero);
    }

    public static void main(String[] args) {
        countPosNegZeroFromString("123-2-30340");
    }
}
