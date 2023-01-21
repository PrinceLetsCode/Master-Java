package leetCode;

public class DiagonalSum {
    public static void main(String[] args) {
        int [][] mat={{1,2,3},
                      {4,5,6},
                      {7,8,9}};

        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int diagonalSum = 0;
        int i=0;
        int j=0;


            while (i < mat.length) {
                diagonalSum += mat[i][j];
                i++;
                j++;
            }

            j=0;
            i=i-1;

        while (i >= 0) {
            diagonalSum += mat[i][j];
            i--;
            j++;
        }

        if (mat.length % 2 != 0 && mat[mat.length/2].length % 2 != 0) {
            int midElement = mat[mat.length / 2][mat[mat.length/2].length / 2];
            diagonalSum=diagonalSum-midElement;
        }

        return diagonalSum;
    }

    public static int diagonalSum_2(int[][] mat) {
        int min = 0, max = mat.length-1, sum = 0;
        while (min < max) {
            sum += mat[min][min] + mat[min][max] + mat[max][min] + mat[max][max];
            min++; max--;
        }
        return min == max ? sum + mat[min][min] : sum;
    }
}
