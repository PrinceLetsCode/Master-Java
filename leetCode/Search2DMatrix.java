package leetCode;

public class Search2DMatrix {


    public static boolean bruteForce(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }


    
    public static boolean searchMatrix(int[][] matrix, int target) {

        //if the matrix is empty return false
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        //create a row and column variable
        int row=0;
        int col=0;

        //loop through the matrix
        while(row<matrix.length && col<matrix[0].length){
            if(matrix[row][col]==target){     //if the value is equal to the target return true
                return true;
            }else if(matrix[row][col]>target){          //if the value is greater than the target return false,because the matrix is sorted
                return false;
            }else{     // if the value is less than the target then increment the column.
                col++;
                if(col==matrix[0].length){  // if the column is equal to the length of the column then increment the row and set the column to 0
                    row++;
                    col=0;
                }
            }
        }


        return false;
    }


    public static void main(String[] args) {

            int[][] matrix = {{1,   3,  5,  7},
                            {10, 11, 16, 20},
                            {23, 30, 34, 50}};

            int target = 4;

            System.out.println(searchMatrix(matrix, target));

    }
}
