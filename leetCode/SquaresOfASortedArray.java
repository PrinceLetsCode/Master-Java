package leetCode;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        int[] result = sortedSquares(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    private static int[] sortedSquares(int[] arr) {
        int[] result = new int[arr.length];
        int i = 0;
        int j = arr.length - 1;
        int k = arr.length - 1;
        while (i <= j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                result[k] = arr[i] * arr[i];
                i++;
            } else {
                result[k] = arr[j] * arr[j];
                j--;
            }
            k--;
        }
        return result;
    }
}
