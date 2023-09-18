package DynamicProgramming;

public class FrogJumpWithKDistance {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        int []dp = new int[n+ 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        int[] distance = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(countWays(n, k, distance));
        System.out.println(countWays_dp(n, k, distance, dp));
        System.out.println(countWays_tabulation(n, k, distance));
    }

    //    Recursion solution
//    time complexity: O(k^n)
//    space complexity: O(n)
    private static int countWays(int ind, int k, int[] distance) {
        if (ind == 0) {
            return 0;
        }
        int minSteps = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            if (ind - i >= 0) {
                int jump = countWays(ind - i, k, distance) + Math.abs(distance[ind] - distance[ind - i]);
                minSteps = Math.min(minSteps, jump);
            }
        }
        return minSteps;
    }

//    Dynamic Programming solution -> Top-Down Approach -> Memoization
//    time complexity: O(n*k)
//    space complexity: O(n)
    private static int countWays_dp(int ind, int k, int[] distance, int[] dp) {
        if (ind == 0) {
            return 0;
        }
        if (dp[ind] != -1) {
            return dp[ind];
        }
        int minSteps = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            if (ind - i >= 0) {
                int jump = countWays_dp(ind - i, k, distance, dp) + Math.abs(distance[ind] - distance[ind - i]);
                minSteps = Math.min(minSteps, jump);
            }
        }
        return dp[ind] = minSteps;
    }

//    Dynamic Programming solution -> Bottom-Up Approach -> Tabulation
//    time complexity: O(n*k)
//    space complexity: O(n)
    private static int countWays_tabulation(int n, int k, int[] distance) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            int minSteps = Integer.MAX_VALUE;
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(distance[i] - distance[i - j]);
                    minSteps = Math.min(minSteps, jump);
                }
            }
            dp[i] = minSteps;
        }
        return dp[n];
    }
}
