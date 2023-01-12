package Recursion;

public class DigitsToWords {

    private static String findMatch(int digit) {
        switch (digit)
        {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "Not a digit";
        }

    }
    public static void main(String[] args) {

        digitsToWords(123);
    }


    public static void digitsToWords(int digit){
        if (digit == 0) {
            return;
        }
        int dig=digit%10;
        digit=digit/10;
        digitsToWords(digit);
        System.out.println(findMatch(dig));
    }
}
