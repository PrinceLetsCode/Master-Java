package Algorithms.searching;

public class Linear_Search {


    public static void linearSearch(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found key " + key + " at " + i + " position");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 89};
        linearSearch(arr, 6);
    }
}
