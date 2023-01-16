package Recursion;

public class DecimalToBinary {
    public static void main(String[] args) {
        String binary = "";
        System.out.println(decimal_to_binary_recursion(4,binary));
    }

    public static String decimal_to_binary_recursion(int decimalNum,String binary) {
        if (decimalNum == 0) {
            return binary;
        }
        int rem = decimalNum % 2;
        decimalNum=decimalNum/2;
        binary=decimal_to_binary_recursion(decimalNum, binary);
        binary=binary+rem;
        return binary;
    }

}
