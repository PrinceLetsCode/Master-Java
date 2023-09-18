package leetCode;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    //    using extra space
    //    TIME COMPLEXITY: O(n^2)
    //    SPACE COMPLEXITY: O(n^2)
    private static void rotate_brute(int[][] matrix) {
        int n = matrix.length;
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[j][n - 1 - i] = matrix[i][j];
            }
        }
    }


    //    in-place
    //    TIME COMPLEXITY: O(n^2)
    //    SPACE COMPLEXITY: O(1)
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }


    public void rotate_2(int[][] matrix) {
        transpose(matrix);
        reflect(matrix);
    }

    public void transpose(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
    }

    public void reflect(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = tmp;
            }
        }
    }
}

/*  Bonus Question: If you're not too confident with matrices and linear algebra, get some more practice by also coding
    a method that transposes the matrix on the other diagonal, and another that reflects from top to bottom. You can
    test your functions by printing out the matrix before and after each operation. Finally, use your functions to
    find three more solutions to this problem. Each solution uses two matrix operations.

    Interview Tip: Terrified of being asked this question in an interview? Many people are: it can be intimidating due
    to the fiddly logic. Unfortunately, if you do a lot of interviewing, the probability of seeing it at least once is
    high, and some people have claimed to have seen it multiple times! This is one of the few questions where I
    recommend practicing until you can confidently code it and explain it without thinking too much.

  */