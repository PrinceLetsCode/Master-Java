package Bit_manipulation;

public class Set_ith_bit {

    public static void set_ith(int n, int i) {
        System.out.print("before setting, the ");
        Find_ith_bit.find_ith(n,i);

        int mask=1<<i;
        int modified_no=n|mask;
        System.out.print("after setting, the ");
        Find_ith_bit.find_ith(modified_no,i);

    }

    public static void main(String[] args) {
        set_ith(59,2);
    }
}
