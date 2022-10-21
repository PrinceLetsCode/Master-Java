package leetCode;


/* Note : sum of a numerical character with '0' gives the numerical value of  the first character
*  for eg: '1'- '0' = 1
* '2' - '0' = 2
* '3' - '0' = 3
* '4' - '0' = 4
*  and so on.
 */

public class BinaryAddition {

    public static String addBinary(String a, String b) {
        // create a res String for storing the result
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1; // i is the index of a from the end
        int j = b.length() - 1; // j is the index of b from the end
        int carry = 0;  // carry is the carry bit
        while(i >= 0 || j >= 0){ // if i or j is negative, then we have reached the end of a or b
            int sum = carry;  // sum is the sum of the current bit of a and b and the carry bit
            if(i >= 0) sum += a.charAt(i--) - '0'; // if i is not negative, then add the current bit of a to sum
            if(j >= 0) sum += b.charAt(j--) - '0'; // if j is not negative, then add the current bit of b to sum
            carry = sum > 1 ? 1 : 0; // if sum is greater than 1, then set carry to 1, otherwise set carry to 0
            res.append(sum % 2); // append the current bit of sum to res
        }
        if(carry != 0) res.append(carry); // if carry is not 0, then append it to res
        return res.reverse().toString(); // reverse res and return it
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));

    }
}

