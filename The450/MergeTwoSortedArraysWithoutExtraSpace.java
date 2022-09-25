package The450;

public class MergeTwoSortedArraysWithoutExtraSpace {

    public static void merge(int[] arr_1, int[] arr_2) {
        int n = arr_1.length;
        int m = arr_2.length;
        int i, k;
        for (i = 0; i < n; i++) {
            // take first element from arr1
            // compare it with first element of second array
            // if condition match, then swap
            if (arr_1[i] > arr_2[0]) {
                int temp = arr_1[i];
                arr_1[i] = arr_2[0];
                arr_2[0] = temp;
            }

            // then sort the second array
            // put the element in its correct position
            // so that next cycle can swap elements correctly
            int first = arr_2[0];
            // insertion sort is used here
            for (k = 1; k < m && arr_2[k] < first; k++) {
                arr_2[k - 1] = arr_2[k];
            }
            arr_2[k - 1] = first;
        }
    }


    public static void main(String[] args) {

        int[] arr_1 = {1, 3, 5, 7};
        int[] arr_2 = {0, 2, 6, 8, 9};
        merge(arr_1, arr_2);
        for (int i = 0; i < arr_1.length; i++) {
            System.out.print(arr_1[i] + " ");
        }

        for (int i = 0; i < arr_2.length; i++) {
            System.out.print(arr_2[i] + " ");
        }
    }
}
