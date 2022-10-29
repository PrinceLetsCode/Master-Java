package leetCode;

public class IntegerToRoman {
    public static void main(String[] args) {
        int num = 1994;
        System.out.println(intToRoman_3(num));
    }

    private static String intToRoman(int num) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[num/1000] + hundreds[(num%1000)/100] + tens[(num%100)/10] + ones[num%10];
    }

    private static String intToRoman_2(int num) {
        String romanNumeral = "";
        while (num >= 1000) {
            romanNumeral += "M";
            num -= 1000;
        }
        while (num >= 900) {
            romanNumeral += "CM";
            num -= 900;
        }
        while (num >= 500) {
            romanNumeral += "D";
            num -= 500;
        }
        while (num >= 400) {
            romanNumeral += "CD";
            num -= 400;
        }
        while (num >= 100) {
            romanNumeral += "C";
            num -= 100;
        }
        while (num >= 90) {
            romanNumeral += "XC";
            num -= 90;
        }
        while (num >= 50) {
            romanNumeral += "L";
            num -= 50;
        }
        while (num >= 40) {
            romanNumeral += "XL";
            num -= 40;
        }
        while (num >= 10) {
            romanNumeral += "X";
            num -= 10;
        }
        while (num >= 9) {
            romanNumeral += "IX";
            num -= 9;
        }
        while (num >= 5) {
            romanNumeral += "V";
            num -= 5;
        }
        while (num >= 4) {
            romanNumeral += "IV";
            num -= 4;
        }
        while (num >= 1) {
            romanNumeral += "I";
            num -= 1;
        }

        return romanNumeral;
    }


    public static String intToRoman_3(int num) {

        // Approach:
        // This method uses two arrays with the corresponding integer-roman map, in descending order.

        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumeral = new StringBuilder();

        for (int i = 0; i < value.length && num > 0; i++) {
            // Check from the highest value, 1000 to the smallest.
            // If it is possible to subtract, for example 400, we know the roman numeral next is "CD".
            while (num >= value[i]) {
                romanNumeral.append(roman[i]);
                num -= value[i];
            }
        }
        return romanNumeral.toString();
    }

}

