package leetCode;

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi("              -42"));
    }

    private static int myAtoi(String s) {

        // i for interating through the string
        int i=0;

        // sign for storing the sign of the number
        int sign=1;

        // result for storing the final result
        int result=0;

        // if the string is empty return 0
        if(s.length()==0) return 0;

        // remove the leading whitespaces
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }

        // if the string contains only whitespaces return 0
        if(i<s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            sign = (s.charAt(i++)=='+')?1:-1;
        }

        // if the current character is a digit and i is not out of bounds and the digit is greater than 0 and less than 9
        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
            // check if the result is greater than Integer.MAX_VALUE/10 or if the result is equal to Integer.MAX_VALUE/10 and the current digit is greater than 7
            if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && s.charAt(i)-'0'>7)){
                // if the sign is positive return Integer.MAX_VALUE else return Integer.MIN_VALUE
                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            // multiply the result by 10 and add the current digit
            result = result*10 + (s.charAt(i++)-'0');
        }
        // return the result with the sign
        return result*sign;

    }
}
