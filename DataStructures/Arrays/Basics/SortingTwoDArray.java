package DataStructures.Arrays.Basics;

public class SortingTwoDArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] result = sort(arr);
//        traverse(result);
    }

    private static void traverse(int[][] result) {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
