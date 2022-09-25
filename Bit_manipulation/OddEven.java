package Bit_manipulation;

public class OddEven {

    public static void find_odd_even(int n) {
        if ((n & 1) == 0) {
            System.out.println("even");
        } else System.out.println("odd");
    }

    public static void main(String[] args) {
        find_odd_even(7);

    }
}
