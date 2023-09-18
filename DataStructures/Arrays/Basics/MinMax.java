package DataStructures.Arrays.Basics;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        int[] result = minMax(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    private static int[] minMax(int[] arr) {
        int[] result = new int[2];
        int min= arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        result[0] = min;
        result[1] = max;

        return result;
    }
}
