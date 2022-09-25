package The450;

import java.util.Arrays;

public class KthSmallestLargest {

    public static void find_kth(int[] arr, int k) {
        Arrays.sort(arr);

        System.out.println(arr[k - 1]);
    }

    public static void main(String[] args) {

        int[] arr = {12, 3, 5, 7, 19};
        find_kth(arr, 3);

    }
}
