package Bit_manipulation;

public class Two_non_repeating_numbers {

    public static void find_two_non_repeating_nums(int[] arr) {
        int res=0;

        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }


    }

    public static void main(String[] args) {

    }
}
