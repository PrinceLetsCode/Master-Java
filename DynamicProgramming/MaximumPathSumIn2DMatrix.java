package DynamicProgramming;

public class MaximumPathSumIn2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(maxPathSum(matrix));
    }

    private static int maxPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int dp [][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        int result = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            result = maxPathSum(matrix, m-1, i,dp);
        }

        return result;
    }

    private static int maxPathSum(int[][] matrix, int m, int n,int [][] dp) {
        if (m < 0 || n < 0 || m >= matrix.length || n >= matrix[0].length) {
            return 0;
        }

        if (dp[m][n] != -1) {
            return dp[m][n];
        }

        int leftDiagonal = maxPathSum(matrix, m-1, n-1, dp);
        int rightDiagonal = maxPathSum(matrix, m-1, n+1, dp);
        int top = maxPathSum(matrix, m-1, n, dp);

        return dp[m][n] = matrix[m][n] + Math.max(leftDiagonal, Math.max(rightDiagonal, top));
    }


}
