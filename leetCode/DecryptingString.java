package leetCode;

public class DecryptingString {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }

    public static String freqAlphabets(String s) {
        // StringBuilder for result
        StringBuilder output = new StringBuilder();

        //iterate from the end of the string to the beginning
        for (int i = s.length() - 1; i >= 0; i--) {
            //if the current char is '#', then we have a 2-digit number
            //otherwise, we have a 1-digit number
            if (s.charAt(i) == '#') {
                // append the char to the result
                // the char is calculated by subtracting '0' from the char at i-1 and i-2 (to get the number) and adding 10*(i-2) to get the correct char.
                output.append((char) ('a' + (s.charAt(i - 1) - '0') + 10 * (s.charAt(i - 2) - '0') - 1));
                i -= 2;  //skip the next 2 chars
            } else {
                // append the char to the result IF the char is not '#'
                output.append((char) ('a' + (s.charAt(i) - '0') - 1));
            }
        }
        output.reverse(); //very helpful method, reverses the whole string

        return output.toString(); //convert StringBuilder obj to string
    }
}
