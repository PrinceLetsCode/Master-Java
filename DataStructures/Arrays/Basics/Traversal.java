package DataStructures.Arrays.Basics;

public class Traversal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        traverse(arr);
    }

    private static void traverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
