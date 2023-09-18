package PrinceLetsCode2.Array;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix_optimized3(matrix, target));
    }


    // brute force. Time complexity: O(n^2)
    private static boolean searchMatrix(int[][] matrix, int target) {

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }

        return false;
    }
    

    // optimized solution. Time complexity: O(n*log(m))

    private static boolean searchMatrix_optimized(int[][] matrix, int target){

        for(int i = 0; i < matrix.length;i++){
            int low = 0;
            int high = matrix[i].length - 1;

            if(binarySearch(matrix[i], target, low, high)){
                return true;
            }
        }

        return false;
    }

    private static boolean binarySearch(int[] nums, int target, int low, int high) {

        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return true;
            }
            else if(nums[mid] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return false;
    }

    // optimization : time complexity: O(n+m)
    private static boolean searchMatrix_optimized2(int[][] matrix, int target){
        int row = 0;
        int col = 0;

        while(row < matrix.length && col < matrix[row].length){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] > target){
                return false;
            }
            else{
                col++;

                if(col == matrix[row].length){
                    row++;
                    col = 0;
                }
            }
        }

        return false;
    }

    // optimization : time complexity: O(log(n*m))

    private static boolean searchMatrix_optimized3(int[][] matrix, int target){
        // matrix is sorted row wise, so we can treat it as a sorted array and apply binary search

        int row = matrix.length;
        int col = matrix[0].length;

        // binary search


        int low = 0;
        int high = row * col - 1;


        while(low <= high){

            // calculate mid
            int mid = low + (high - low) / 2;

            // check if mid is equal to target
            //mid/col gives the row number
            //mid%col gives the column number
            if(matrix[mid/col][mid%col] == target){
                return true;
            }
            else if(matrix[mid/col][mid%col] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return false;
    }

}
