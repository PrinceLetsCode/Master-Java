package Algorithms.sorting;

public class Selection_Sort {


    public static void selection_sort(int[] arr) {


        for (int i = 0; i < arr.length - 1; i++) {

            // we make the first element as the minimum element.
            int min = i;

            //this loop is for finding the minimum element in the unsorted sub-array.
            //it runs from i+1 to n-1 times to find the minimum element.
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[min]) {
                    min = j;
                    //if there is any element which is less than the minimum element, then we update the value of min-index.
                }
            }

            //if the value of min-index is not equal to i, then we swap the elements at i and min-index.
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }


        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

    }


    public static void main(String[] args) {

        int arr[] = {12, 29, 25, 8, 32, 17, 40};
        selection_sort(arr);

    }
}
