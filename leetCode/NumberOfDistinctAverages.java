package leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctAverages {
    public static void main(String[] args) {
        int[] nums = {4, 1, 4, 0, 3, 5};
        System.out.println(distinctAverages(nums));
    }

    private static int distinctAverages(int[] nums) {
        Arrays.sort(nums);

        Set<Double> u = new HashSet<>();
        int n = nums.length;

        for(int i = 0; i < n/2; i++)
            u.add((nums[i] + nums[n-1-i]) / 2.0);

        return u.size();

    }
}

