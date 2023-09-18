package DataStructures.Arrays.Basics;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        int[] result = insert(arr, 4, 4);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }


    // insert val at pos in arr
    // time complexity : O(n)
    // space complexity : O(n)
    private static int[] insert(int[] arr, int pos,int val) {
        int[] result = new int[arr.length + 1];
        int i = 0;
        while(i < pos-1) {
            result[i] = arr[i];
            i++;
        }
        result[i] = val;

        while(i < arr.length) {
            result[i+1] = arr[i];
            i++;
        }

        return result;

    }
}
