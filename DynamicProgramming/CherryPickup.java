package DynamicProgramming;

public class CherryPickup {
    public static void main(String[] args) {
        int[][] grid = {{0, 1, -1}, {1, 0, -1}, {1, 1, 1}};
        System.out.println(cherryPickup(grid));
        System.out.println(cherryPickup2(grid));
    }

    private static int cherryPickup(int[][] grid) {
        int i = 0;
        int j1 = 0;
        int j2 = grid[0].length-1;

        int dp [][][] = new int[grid.length][grid[0].length][grid[0].length];

        return cherryPickup(grid,i,j1,j2, dp);
    }

    private static int cherryPickup(int[][] grid, int i, int j1, int j2,int [][][] dp) {
      if(j1 < 0 || j1 >= grid[0].length || j2 < 0 || j2 >= grid[0].length) return 0;

        if(dp[i][j1][j2] != 0) return dp[i][j1][j2];

      if(i == grid.length-1) {
        if(j1 == j2) return grid[i][j1];
        else return grid[i][j1] + grid[i][j2];
      }
        int max = 0;
        for(int k1 = -1; k1 <= 1; k1++) {
            for(int k2 = -1; k2 <= 1; k2++) {
                if (j1==j2) {
                    max = Math.max(max, grid[i][j1] + cherryPickup(grid, i+1, j1+k1, j2+k2,dp));
                } else {
                    max = Math.max(max,grid[i][j1] + grid[i][j2]+ cherryPickup(grid, i+1, j1+k1, j2+k2,dp));
                }
            }
        }
        return dp[i][j1][j2] = max;
    }

    // Approach 2: Bottom Up DP -> Tabulation
    // time complexity: O(n^3)
    // space complexity: O(n^3)

    private static int cherryPickup2(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int dp [][][] = new int[m][n][n];
        for (int j1 = 0; j1 < n; j1++) {
            for (int j2 = 0; j2 < n; j2++) {
                if (j1 == j2) {
                    dp[m-1][j1][j2] = grid[m-1][j1];
                } else {
                    dp[m-1][j1][j2] = grid[m-1][j1] + grid[m-1][j2];
                }
            }
        }

        for (int i = m-2;i>=0;i--){
            for (int j1 = 0; j1 < n; j1++) {
                for (int j2 = 0; j2 < n; j2++) {
                    int max = 0;
                    for (int k1 = -1; k1 <= 1; k1++) {
                        for (int k2 = -1; k2 <= 1; k2++) {
                           int value = 0;
                            if (j1 == j2) {
                                 value = grid[i][j1];
                            } else {
                                 value = grid[i][j1] + grid[i][j2];
                            }
                            if (j1+k1 >= 0 && j1+k1 < n && j2+k2 >= 0 && j2+k2 < n) {
                                value += dp[i + 1][j1 + k1][j2 + k2];
                            }
                            else {
                                value+=0;
                            }
                            max = Math.max(max, value);
                        }
                    }
                    dp[i][j1][j2] = max;
                }
            }
        }

        return dp[0][0][n-1];

    }


}

