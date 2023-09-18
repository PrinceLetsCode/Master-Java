package DataStructures.Arrays.Basics;

public class Deletion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        int[] result = delete_val(arr, 4);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }


    // delete element at pos in arr
    private static int[] delete(int[] arr, int pos) {
        int[] result = new int[arr.length - 1];
        int iterator = 0;
        while (iterator < pos - 1) {
            result[iterator] = arr[iterator];
            iterator++;
        }

        while (iterator < arr.length - 1) {
            result[iterator] = arr[iterator + 1];
            iterator++;
        }

        return result;
    }

    // delete element with value val in arr

    private static int[] delete_val(int[] arr, int val) {

        // if val is not present in arr
        for (int i : arr) {
            if (i == val) {
                break;
            }
            else {
                return arr;
            }
        }

        int[] result = new int[arr.length - 1];
        int iterator = 0;
        while (iterator < arr.length) {
            if (arr[iterator] == val) {
                break;
            }
            result[iterator] = arr[iterator];
            iterator++;
        }

        while (iterator < arr.length - 1) {
            result[iterator] = arr[iterator + 1];
            iterator++;
        }

        return result;
    }
}
