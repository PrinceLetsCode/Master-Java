package Bit_manipulation;

public class SwapNumbers {


    public static void Swap(int a, int b) {
        System.out.println("Originally: a = " + a + " and b = " + b);

        a^=b;
        b^=a;
        a^=b;

        System.out.println("After swapping: a = " + a + " and b = " + b);
    }


    public static void main(String[] args) {

        Swap(2, 7);
    }
}
