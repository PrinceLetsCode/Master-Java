package leetCode;

public class ReshapeTheMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        // get the number of rows and columns in the original matrix.
        int matRow=mat.length;
        int matCol=mat[0].length;

        // if the number of elements in the original matrix is not equal to the number of elements in the reshaped matrix
        // then return the original matrix.
        if(matRow*matCol != r*c)return mat;

        // create a new matrix with the number of rows and columns of the reshaped matrix.
        int[][] res = new int[r][c];

        // initialize the row and column of the new matrix.
        int out_row=0;
        int out_col=0;

        // iterate through the original matrix.
        for (int i = 0; i < matRow; i++) {
            // iterate through the columns of the original matrix.
            for (int j = 0; j < matCol; j++) {

                // add the element to the new matrix.
                res[out_row][out_col] = mat[i][j];
                out_col++; // increment the column of the new matrix.

                // if the column of the new matrix is equal to the number of columns of the reshaped matrix,
                if (out_col == c) {
                    out_col=0; // reset the column of the new matrix.
                    out_row++; // increment the row of the new matrix.
                }

            }
        }

        // return the new matrix.
        return res;

    }

    public static void main(String[] args) {

        int [][]mat = {{1,2},{3,4}};
        int[][] res = matrixReshape(mat, 1, 4);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
}
