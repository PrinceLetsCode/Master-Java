package The450;

import java.util.Arrays;

public class SumOfPiarEqualsX {

    public static void find_pair(int[] arr,int target) {
        int n = arr.length;
        if (n < 2)
            return;
        Arrays.sort(arr);
        int l = 0, r = n - 1;

        while (l < r) {
            int currentSum = arr[l] + arr[r];
            if (currentSum == target) {
                System.out.println(arr[l] + " " + arr[r]);
                l++;
                r--;
            } else if (arr[l] + arr[r] < target)
                l++;
            else
                r--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2,2, 3, 4, 5,5, 6};
        find_pair(arr, 8);
    }

}
