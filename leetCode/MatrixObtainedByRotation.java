package leetCode;

import static java.util.function.Predicate.isEqual;

public class MatrixObtainedByRotation {
    public static void main(String[] args) {
        int[][] mat = {{0, 1}, {1, 0}};
    }

    private static boolean findRotation(int[][] mat, int[][] target) {

        for (int i = 0; i < 4; i++) {
            if (isEqual(mat, target)) {
                return true;
            }
            mat = transpose(mat);
            mat = reverse(mat);
        }
        return false;
    }

    private static boolean isEqual(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int[][] transpose(int[][] mat) {
        int[][] res = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                res[i][j] = mat[j][i];
            }
        }
        return res;
    }

    private static int[][] reverse(int[][] mat) {
        int[][] res = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                res[i][j] = mat[i][mat[0].length - 1 - j];
            }
        }
        return res;
    }
}
