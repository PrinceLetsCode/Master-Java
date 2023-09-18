package Bit_manipulation;

public class NumberOfOneBits {
    public static void main(String[] args) {
       int n=0001010101010;
        System.out.println(findOneBits(n));
    }

    private static int findOneBits(int n)
    {
        int counter=0;
        while (n != 0) {
            counter++;
            n=n&(n-1);
        }
        return counter;
    }

}
