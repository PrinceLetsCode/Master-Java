package Bit_manipulation;

public class Clearing_ith_bit {

    public static void clear_ith(int n, int i) {

        System.out.println("Before clearing, the ");
        Find_ith_bit.find_ith(n,i);

        int mask = ~(i << i);
        int modified_no = n & mask;

        System.out.println("After clearing, the ");
        Find_ith_bit.find_ith((modified_no), i);
    }

    public static void main(String[] args) {

        clear_ith(59, 5);

    }
}
