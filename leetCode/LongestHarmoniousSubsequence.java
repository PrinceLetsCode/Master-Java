package leetCode;

public class LongestHarmoniousSubsequence {
    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }

    private static int findLHS(int[] nums) {

        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            boolean flag = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                } else if (nums[j] == nums[i]+1) {
                    count++;
                    flag = true;
                }
            }
            if (flag) {
                max = Math.max(max, count);
            }
        }
        return max;

    }
}
