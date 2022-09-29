package Algorithms.sorting;

public class Merge_Sort {


    public static void merge_sort(int[] arr, int low_bnd, int upr_bnd) {

        if (low_bnd < upr_bnd) {
            //this will divide the array into two sub-arrays.
            int mid = (low_bnd + upr_bnd) / 2;

            //this will sort the left sub-array.
            merge_sort(arr, low_bnd, mid);

            //this will sort the right sub-array.
            merge_sort(arr, mid + 1, upr_bnd);

            //this will merge the sorted sub-arrays.
            merge(arr, low_bnd, mid, upr_bnd);
        }
    }

    private static void merge(int[] arr, int low_bnd, int mid, int upr_bnd) {


        //determining the size of left sub-array;
        int n1 = mid - low_bnd + 1;

        //determining the size of right sub-array;
        int n2 = upr_bnd - mid;

        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];

        /*Copy data to temp arrays from original array */

        // data of index 0 to mid will be transferred from the original array to the left temp array.
        for (int i=0; i<n1; ++i)
            L[i] = arr[low_bnd + i];

        // data of index mid  to n-1 will be transferred from the original array to the right temp array.
        for (int j=0; j<n2; ++j)
            R[j] = arr[mid + 1+ j];


        int i = 0, j = 0;

        // Initial index of merged sub-array.
        int k = low_bnd;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    public static void main(String[] args) {

        int []arr={15, 5, 24, 8, 1, 3, 16, 10, 20};
        System.out.println("Given Array");
        printArray(arr);

        merge_sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);




    }

}
