package leetCode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));
    }

    private static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int start = 0;
        int end = 0;

        while (end < nums.length) {
            while (end < nums.length - 1 && nums[end] + 1 == nums[end + 1]) {
                end++;
            }

            if (start == end) {
                result.add(nums[start] + "");
            } else {
                result.add(nums[start] + "->" + nums[end]);
            }

            start = end + 1;
            end = start;
        }

        return result;
    }
}
