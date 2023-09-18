package DynamicProgramming;

import java.util.List;

// Link: https://leetcode.com/problems/triangle/
public class Triangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = List.of(
                List.of(2),
                List.of(3, 4),
                List.of(6, 5, 7),
                List.of(4, 1, 8, 3)
        );

        int n = triangle.size();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(minimumTotal(triangle));
        System.out.println(minimumTotal_dp(triangle,0,0,dp));
        System.out.println(minimumTotal_tabulation(triangle));
    }



    private static int minimumTotal(List<List<Integer>> triangle) {

        return minimumTotal(triangle, 0, 0);
    }

    private static int minimumTotal(List<List<Integer>> triangle, int row, int col) {
        if (row == triangle.size()) {
            return 0;
        }

        int left = triangle.get(row).get(col) + minimumTotal(triangle, row + 1, col);
        int right = triangle.get(row).get(col) + minimumTotal(triangle, row + 1, col + 1);

        return Math.min(left, right);
    }

    private static int minimumTotal_dp(List<List<Integer>> triangle, int row, int col, int[][] dp) {
        if (row == triangle.size()) {
            return 0;
        }
        if (dp[row][col] != -1) {
            return dp[row][col];
        }
        int downLeft = triangle.get(row).get(col) + minimumTotal_dp(triangle, row + 1, col, dp);
        int downRight = triangle.get(row).get(col) + minimumTotal_dp(triangle, row + 1, col + 1, dp);

        return dp[row][col] = Math.min(downLeft, downRight);
    }

//    approach 3: Dynamic Programming solution -> Bottom-Up Approach -> Tabulation
//    time complexity: O(m*n)
//    space complexity: O(m*n)

    private static int minimumTotal_tabulation(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];

        /*
         The first step of the algorithm is to set the last row of dp to the corresponding values in the last
         row of the triangle. This is because the minimum path sum from the last row to the bottom of the
         triangle is just the value of the element itself.
         */
        for (int i = 0; i < n; i++) {
            dp[n - 1][i] = triangle.get(n - 1).get(i);
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {

                int down = triangle.get(i).get(j) + dp[i + 1][j];
                int downRight = triangle.get(i).get(j) + dp[i + 1][j + 1];

                dp[i][j] = Math.min(down, downRight);
            }
        }

        return dp[0][0];
    }
}
