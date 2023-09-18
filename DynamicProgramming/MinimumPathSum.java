package DynamicProgramming;

public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int dp[][] = new int[grid.length][grid[0].length];

        System.out.println(minPathSum(grid));
        System.out.println(minPathSum_dp(grid, grid.length - 1, grid[0].length - 1, dp));
        System.out.println(minPathSum_tabulation(grid));
        System.out.println(minPathSum_tabulation_space_optimized(grid));
    }


    private static int minPathSum(int[][] grid) {
        int i = grid.length;
        int j = grid[0].length;

        return minPathSum(grid, i - 1, j - 1);
    }

    private static int minPathSum(int[][] grid, int i, int j) {
        if(i == 0 && j == 0) {
            return grid[i][j];
        }

        int up = Integer.MAX_VALUE;
        int left = Integer.MAX_VALUE;
        if (i > 0) {
            up = grid[i][j] + minPathSum(grid, i-1, j);
        }
        if (j > 0) {
            left = grid[i][j] + minPathSum(grid, i, j-1);
        }
        return Math.min(up, left);
    }

    private static int minPathSum_dp(int[][] grid, int i, int j, int[][] dp) {
        if(i == 0 && j == 0) {
            return grid[i][j];
        }

        if(dp[i][j] != 0) {
            return dp[i][j];
        }
        int up = Integer.MAX_VALUE;
        int left = Integer.MAX_VALUE;
        if (i > 0) {
            up = grid[i][j] + minPathSum_dp(grid, i-1, j, dp);
        }
        if (j > 0) {
            left = grid[i][j] + minPathSum_dp(grid, i, j-1, dp);
        }
        dp[i][j] = Math.min(up, left);
        return dp[i][j];
    }



//    Tabulation
    // time complexity: O(m*n)
    // space complexity: O(m*n)

    private static int minPathSum_tabulation(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length + 1];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i== 0 && j ==0){
                    dp[i][j] = grid[0][0];
                }
                else {
                    int up = Integer.MAX_VALUE;
                    if (i>0){
                         up = grid[i][j] + dp[i - 1][j];
                    }
                    int left = Integer.MAX_VALUE;
                    if (j>0){
                         left = grid[i][j] + dp[i][j - 1];
                    }
                    dp[i][j] = Math.min(up, left);
                }
            }
        }
        return dp[grid.length - 1][grid[0].length - 1];
    }


    // space optimized
    // time complexity: O(m*n)
    // space complexity: O(n)

    private static int  minPathSum_tabulation_space_optimized(int[][] grid) {
        int[] dp = new int[grid[0].length + 1];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i== 0 && j ==0){
                    dp[j] = grid[0][0];
                }
                else {
                    int up = Integer.MAX_VALUE;
                    if (i>0){
                        up = grid[i][j] + dp[j];
                    }
                    int left = Integer.MAX_VALUE;
                    if (j>0){
                        left = grid[i][j] + dp[j - 1];
                    }
                    dp[j] = Math.min(up, left);
                }
            }
        }
        return dp[grid[0].length - 1];
    }

}
