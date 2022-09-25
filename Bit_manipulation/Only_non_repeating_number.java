package Bit_manipulation;

public class Only_non_repeating_number {


    public static void find_non_repeating(int[] arr) {
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }

        res = res & ~(res - 1);
        int num_1 = 0;
        int num_2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & (res)) > 0)
                num_1 = num_1 ^ arr[i];
            else num_2 = num_2 ^ arr[i];
        }


        System.out.println(num_1 + ", " + num_2);
    }

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 1, 2, 3, 4, 5, 5, 6, 7, 7};
        find_non_repeating(arr);

    }
}
