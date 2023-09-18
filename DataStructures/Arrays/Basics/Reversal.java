package DataStructures.Arrays.Basics;

public class Reversal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        int[] result = reverse(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    private static int[] reverse(int[] arr) {

        int size = arr.length;

        for (int i = 0; i < size / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size-i-1] = temp;
        }

        return arr;
    }
}
