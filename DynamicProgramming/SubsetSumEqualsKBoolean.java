package DynamicProgramming;

public class SubsetSumEqualsKBoolean {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 10;
        System.out.println(canPartition(nums, k));
        System.out.println(canPartition2(nums,k));
    }

    private static boolean canPartition(int[] nums, int k) {
        boolean[][] dp = new boolean[nums.length][k + 1];
        for (int i = 0; i < nums.length; i++) {
            dp[i][0] = true;
        }

        return canPartition(nums,k,nums.length-1,dp);
    }

    private static boolean canPartition(int[] nums, int k, int n,boolean [][] dp) {
        if (k == 0) {
            return true;
        }
        if(n==0){
            return nums[0]==k;
        }
        if (n < 0 || k < 0) {
            return false;
        }

        if(dp[n][k]){
            return dp[n][k];
        }

        boolean notPick = canPartition(nums, k, n - 1,dp);
        boolean pick = false;
        if (k>=nums[n])
             pick = canPartition(nums, k - nums[n], n - 1,dp);

        return dp[n][k] = notPick || pick;
    }

    // Approach 2: Bottom Up DP -> Tabulation
    // time complexity: O(n*k)
    // space complexity: O(n*k)

    private static boolean canPartition2(int[] nums, int target) {
        boolean[][] dp = new boolean[nums.length][target + 1];
        for (int i = 0; i < nums.length; i++) {
            dp[i][0] = true;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <= target; j++) {
                if (i == 0) {
                    dp[i][j] = nums[i] == j;
                } else {
                    boolean notPick = dp[i - 1][j];
                    boolean pick = false;

                    if (j >= nums[i]) {
                        pick = dp[i - 1][j - nums[i]];
                    }

                    dp[i][j] = notPick || pick;
                }
            }
        }
        return dp[nums.length - 1][target];
    }
}
