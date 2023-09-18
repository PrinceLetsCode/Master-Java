package DynamicProgramming;

public class UniquePaths {
    public static void main(String[] args) {


        int[][] dp = new int[4][8];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(uniquePaths(3, 7));
        System.out.println(uniquePaths_dp(3, 7, dp));
        System.out.println(uniquePaths_tabulation(3, 7));
        System.out.println(uniquePaths_tabulation_space_optimized(3, 7));


    }


//    Recursive solution
    //time complexity: O(2^(m+n))
    //space complexity: O(m+n)
    private static int uniquePaths(int m, int n) {
         // This signifies the minimum number of steps required to reach the starting point from the starting point.
        if (m == 1 || n == 1) {
            return 1;
        }

        // This signifies the minimum number of steps required to reach the starting point from the current point.
        return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
    }



//    Dynamic Programming solution -> Top-Down Approach -> Memoization
    //time complexity: O(m*n)
    //space complexity: O(m*n)
    private static int uniquePaths_dp(int m, int n, int[][] dp) {
        if (m == 1 || n == 1) {
            return 1;
        }
        if (dp[m][n] != -1) {
            return dp[m][n];
        }
        return dp[m][n] = uniquePaths_dp(m - 1, n, dp) + uniquePaths_dp(m, n - 1, dp);
    }

//    Dynamic Programming solution -> Bottom-Up Approach -> Tabulation
    //time complexity: O(m*n)
    //space complexity: O(m*n)
    private static int uniquePaths_tabulation(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m][n];
    }

    //    Dynamic Programming solution -> Bottom-Up Approach -> space optimized
    //    time complexity: O(m*n)
    //    space complexity: O(n)
    private static int uniquePaths_tabulation_space_optimized(int m, int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        return dp[n];
    }
}
