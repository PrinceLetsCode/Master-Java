package DataStructures.Arrays.Basics;

public class SplittingArrayIntoSmallerArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        int[][] result = split_optimized(arr, 7);
        for (int[] i : result) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static int[][] split(int[] arr, int pivot) {

        if (pivot > arr.length) {
            int result[][] = new int[1][];
            result[0] = arr;
            return result;
        }

        int[][] result = new int[2][];
        int[] first = new int[pivot];
        int[] second = new int[arr.length - pivot];

        for (int i = 0; i < pivot; i++) {
            first[i] = arr[i];
        }

        for (int i = pivot; i < arr.length; i++) {
            second[i - pivot] = arr[i];
        }

        result[0] = first;
        result[1] = second;

        return result;
    }

    // Better solution
    // two pointers
    // time complexity : O(n)
    // space complexity : O(n)

    private static int[][] split_optimized(int[] arr, int pivot) {
        if (pivot > arr.length) {
            int result[][] = new int[1][];
            result[0] = arr;
            return result;
        }

        int[][] result = new int[2][];
        int[] first = new int[pivot];
        int[] second = new int[arr.length - pivot];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr.length) {
            if (i < pivot) {
                first[j] = arr[i];
                j++;
            } else {
                second[k] = arr[i];
                k++;
            }
            i++;
        }

        result[0] = first;
        result[1] = second;

        return result;
    }
}
