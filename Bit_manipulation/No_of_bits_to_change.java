package Bit_manipulation;


/*  this is a  program which tells us how many bits we have to change to convert one number to another. */

public class No_of_bits_to_change {


    public static void Find_no_of_bits(int num_1, int num_2) {

        int counter=0;
        int xor_result = num_1 ^ num_2;
        int n=xor_result;
        while (n != 0) {
            counter++;
            n = n & (n- 1);
        }

        System.out.println(counter);

    }

    public static void main(String[] args) {
        Find_no_of_bits(22, 27);
    }

}
