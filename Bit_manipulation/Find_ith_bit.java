package Bit_manipulation;

public class Find_ith_bit {

    public static void find_ith(int n, int i) {
        int mask = 1 << i;

        if ((n & mask) == 0) {
            System.out.println("ith bit is 0");
        } else System.out.println("ith bit is 1");
    }

    public static void main(String[] args) {
        find_ith(59, 2);
    }
}
