package The450;

import java.util.Arrays;

public class MinimizeTheHeight {

    public static int minimise_height(int[] arr, int k) {

        int n=arr.length;
        Arrays.sort(arr);
        // Maximum possible height difference
        int ans = arr[n - 1] - arr[0];

        int tempmin, tempmax;
        tempmin = arr[0];
        tempmax = arr[n - 1];

        for (int i = 1; i < n; i++) {

            // if on subtracting k we got negative then
            // continue
            if (arr[i] - k < 0)
                continue;

            // this line compares the current minimum height which is at zero with every other element and if
            // it is smaller than it it updates the min value with it.
            tempmin = Math.min(arr[0] + k, arr[i] - k);

            // this line compares the current maximum height which is at zero with every other element and if
            // it is greater than it. it updates the max value with it.
            tempmax
                    = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            ans = Math.min(ans, tempmax - tempmin);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 8, 8, 8, 9};
        System.out.println(minimise_height(arr, 6));
    }
}
