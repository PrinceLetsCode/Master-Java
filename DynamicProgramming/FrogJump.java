package DynamicProgramming;


public class FrogJump {

    /*
     * frog jump from code studio
     */
    public static void main(String[] args) {
        int n = 3;
        int[] height = {10, 20, 30, 10};
        int [] dp = new int[n+1];
        System.out.println(frogJump_dp(n,height,dp));
        System.out.println(frogJump_recursion(n, height));
        System.out.println(frogJump_tabulation(n, height));
        System.out.println(frogJump_tabulation_space_optimization(n, height));
    }


//    using Dynamic Programming
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    private static int frogJump_dp(int n, int[] height, int[] dp) {
        if (n == 0) {
            return 0;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        int left = frogJump_dp(n - 1, height, dp) + Math.abs(height[n] - height[n - 1]);
        int right = Integer.MAX_VALUE;
        if (n > 1)
            right = frogJump_dp(n - 2, height, dp) + Math.abs(height[n] - height[n - 2]);
        return dp[n] = Math.min(left, right);
    }

    // using recursion
    // Time Complexity: O(2^n)
    // Space Complexity: O(n)
    private static int frogJump_recursion(int ind, int[] height) {
        if (ind == 0) {
            return 0;
        }
        int left = frogJump_recursion(ind - 1, height) + Math.abs(height[ind] - height[ind - 1]);
        int right = Integer.MAX_VALUE;
        if (ind > 1)
            right = frogJump_recursion(ind - 2, height) + Math.abs(height[ind] - height[ind - 2]);
        return Math.min(left, right);
    }

    // using tabulation
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    private static int frogJump_tabulation(int n, int[] height) {
        int[] dp = new int[n];
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            int left = dp[i - 1] + Math.abs(height[i] - height[i - 1]);
            int right = Integer.MAX_VALUE;
            if (i > 1)
                right = dp[i - 2] + Math.abs(height[i] - height[i - 2]);
            dp[i] = Math.min(left, right);
        }
        return dp[n-1];
    }

    // using tabulation+space optimization
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    private static int frogJump_tabulation_space_optimization(int n, int[] height) {
        int prev2 = 0;
        int prev = 0;
        int current = 0;
        for (int i = 1; i <= n; i++) {
            int left = prev + Math.abs(height[i] - height[i - 1]);
            int right = Integer.MAX_VALUE;
            if (i > 1)
                right = prev2 + Math.abs(height[i] - height[i - 2]);
            current = Math.min(left, right);
            prev2 = prev;
            prev = current;
        }
        return current;
    }

}
