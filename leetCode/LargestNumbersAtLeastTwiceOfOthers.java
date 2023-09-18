package leetCode;

public class LargestNumbersAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(dominantIndex(nums));

    }

    private static int dominantIndex(int[] nums) {
        int max= nums[0];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max= nums[i];
                index = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != index && nums[i] * 2 > max) {
                return -1;
            }
        }

        return index;
    }
}
