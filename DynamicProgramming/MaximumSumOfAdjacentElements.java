package DynamicProgramming;

public class MaximumSumOfAdjacentElements {
    public static void main(String[] args) {
        int[] arr = {5, 5, 10, 100, 10, 5};
        int [] dp = new int[arr.length];
        System.out.println(maxSum(arr.length-1,arr));
        System.out.println(maxSum_dp(arr.length-1,arr,dp));
        System.out.println(maxSum_tabulation(arr.length-1,arr));
        System.out.println(maxSum_tabulation_spaceOptimized(arr.length-1,arr));
    }

//    RECURSIVE SOLUTION
//    time complexity: O(2^n)
//    space complexity: O(n)
    private static int maxSum(int ind,int[] arr) {
        if (ind == 0) {
            return arr[ind];
        }
        if(ind<0) {
            return 0;
        }
        int pick = arr[ind] + maxSum(ind-2,arr);
        int notPick = maxSum(ind-1,arr);
        return Math.max(pick, notPick);
    }

//    DYNAMIC PROGRAMMING SOLUTION -> TOP-DOWN APPROACH -> MEMOIZATION
//    time complexity: O(n)
//    space complexity: O(n)
    private static int maxSum_dp(int ind,int[] arr,int[] dp){
        if (ind == 0) {
            return arr[ind];
        }
        if(ind<0) {
            return 0;
        }
        if(dp[ind]!=0) {
            return dp[ind];
        }
        int pick = arr[ind] + maxSum_dp(ind-2,arr,dp);
        int notPick = maxSum_dp(ind-1,arr,dp);
        return dp[ind] = Math.max(pick, notPick);
    }

    //    DYNAMIC PROGRAMMING SOLUTION -> BOTTOM-UP APPROACH -> TABULATION
    //    time complexity: O(n)
    //    space complexity: O(n)
    private static int maxSum_tabulation(int n,int[] arr){
        int[] dp = new int[n+1];
        dp[0] = arr[0];
        for (int i = 1; i <= n; i++) {
            int pick = arr[i];
            if (i - 2 >= 0) {
                pick += dp[i - 2];
            }
            int notPick = dp[i - 1];
            dp[i] = Math.max(pick, notPick);
        }
        return dp[n];
    }

//    space optimized solution
//    time complexity: O(n)
    //   space complexity: O(1)
    private static int maxSum_tabulation_spaceOptimized(int n,int[] nums){
        int prev = nums[0];
        int prev2 = 0;
        for (int i = 1; i <= n; i++) {
            int pick = nums[i];
            if (i - 2 >= 0) {
                pick += prev2;
            }
            int notPick = 0+ prev2;
            int curr = Math.max(pick, notPick);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }

}
