package DynamicProgramming;

public class UniquePathsII {
    public static void main(String[] args) {
        int[][] obstacleGrid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(uniquePathsWithObstacles(obstacleGrid));
        System.out.println(uniquePathsWithObstacles_dp(obstacleGrid, obstacleGrid.length - 1, obstacleGrid[0].length - 1, dp));
        System.out.println(uniquePathsWithObstacles_tabulation(obstacleGrid));
        System.out.println(uniquePathsWithObstacles_tabulation_spaceOptimized(obstacleGrid));
    }

    private static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        return uniquePathsWithObstacles(obstacleGrid, m - 1, n - 1);
    }

    private static int uniquePathsWithObstacles(int[][] obstacleGrid, int m, int n) {
        if (m >= 0 && n >= 0 && obstacleGrid[m][n] == 1) {
            return 0;
        }
        if (m == 0 && n == 0) {
            return 1;
        }
        if (m < 0 || n < 0) {
            return 0;
        }

        int up = uniquePathsWithObstacles(obstacleGrid, m - 1, n);
        int left = uniquePathsWithObstacles(obstacleGrid, m, n - 1);

        return up + left;
    }


//    approach 2: Dynamic Programming solution -> Top-Down Approach -> Memoization
//    time complexity: O(m*n)
//    space complexity: O(m*n)

    private static int uniquePathsWithObstacles_dp(int[][] obstacleGrid, int m, int n, int[][] dp) {
        if (m >= 0 && n >= 0 && obstacleGrid[m][n] == 1) {
            return 0;
        }
        if (m == 0 && n == 0) {
            return 1;
        }
        if (m < 0 || n < 0) {
            return 0;
        }
        if (dp[m][n] != -1) {
            return dp[m][n];
        }

        int up = uniquePathsWithObstacles_dp(obstacleGrid, m - 1, n, dp);
        int left = uniquePathsWithObstacles_dp(obstacleGrid, m, n - 1, dp);

        return dp[m][n] = up + left;
    }

    //    approach 3: Dynamic Programming solution -> Bottom-Up Approach -> Tabulation
    //    time complexity: O(m*n)
    //    space complexity: O(m*n)

    private static int uniquePathsWithObstacles_tabulation(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                } else {
                    int up = i - 1 >= 0 ? dp[i - 1][j] : 0;
                    int left = j - 1 >= 0 ? dp[i][j - 1] : 0;
                    dp[i][j] = up + left;
                }
            }
        }
        return dp[m - 1][n - 1];
    }


//    approach 4: Dynamic Programming solution -> Bottom-Up Approach -> Tabulation (Space Optimized)
//    time complexity: O(m*n)
//    space complexity: O(n)

    private static int uniquePathsWithObstacles_tabulation_spaceOptimized(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] dp = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[j] = 0;
                } else if (i == 0 && j == 0) {
                    dp[j] = 1;
                } else {
                    int up = i - 1 >= 0 ? dp[j] : 0;
                    int left = j - 1 >= 0 ? dp[j - 1] : 0;
                    dp[j] = up + left;
                }
            }
        }
        return dp[n - 1];
    }

}
