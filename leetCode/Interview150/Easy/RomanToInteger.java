package leetCode.Interview150.Easy;

public class RomanToInteger {

    // First we need to create a map of roman characters and their corresponding integer values.
    static int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    // Now we need to create a function that will return the integer value of the roman number.
    public static int romanToInt(String s) {
        // Initialize result
        int out=0;

        // Traverse through all characters of input string
        int i;
        for (i =1; i< s.length(); i++){
            // Getting value of symbol s[i] and s[i-1]
            // compare the values and subtract the value of the symbol to the result if the value of the symbol is greater than the previous symbol.
            if (value(s.charAt(i-1))<value(s.charAt(i))){
                out -= value(s.charAt(i-1));
            }else
                // If the value of the symbol is less than the previous symbol, add the value of the symbol to the result.
                out += value(s.charAt(i-1));
        }

        // Add the value of the last symbol to the result.
        out += value(s.charAt(i-1));

        // return the result.
        return out;

    }

    public static void main(String[] args) {

        String s = "DXLLX";  // 600 in integer.
        System.out.println(romanToInt(s));


    }
}

