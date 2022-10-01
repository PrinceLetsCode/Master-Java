package Algorithms.sorting;

//divide-and-conquer.
//in-space.
//Quicksort works by dividing a large array into smaller arrays and then sorting those smaller arrays.
// A pivot element is used to partition a large array into smaller arrays.
// smaller arrays are divided recursively until an array with only one or no elements is created.


//time complexity: Worst Case= O(n^2), Best Case, Average Case=O(n log n).

/* Quicksort implementation requires two main methods:

quickSort(): Selects a pivot element, partitions the array around the pivot element, and recursively sorts the partitioned subarrays.
partition(): Assigns the pivot element and places the pivot element at its right position in the sorted array. Then, it places
all smaller elements to the left of the pivot and places all larger or equal elements to the pivot’s right.

*/

public class QuickSort {

    public static void quick_sort(int[] arr, int lwr_bnd, int upr_bnd) {
        //we perform partitioning until lower bound is less than upper bound.
        if (lwr_bnd < upr_bnd) {
            //we partition the original array and attain the pivot point for next sub-array in loc variable.
            int loc=partition(arr, lwr_bnd, upr_bnd);

            //we perform quick-sort on left sub array. with original lower bound and loc-1 as  the new upper bound.
            quick_sort(arr, lwr_bnd, loc - 1);

            //we perform quick-sort on the right sub array with the loc+1 as the lower bound and original upper bound.
            quick_sort(arr, loc + 1, upr_bnd);
        }
    }


    /*
        this function divides the array on pivot point.
        all the elements smaller than the pivot is put on the left side.
        all the elements greater than the pivot is put on the right side.
    */
    private static int partition(int[] arr, int lwr_bnd, int upr_bnd) {

        int pivot=arr[lwr_bnd];  //chooses the first element of sub-array to be the pivot element.
        int start=lwr_bnd;       //chooses the first element of sub-array to be start pointer.it will be incremented until it finds a greater element than pivot.
        int end=upr_bnd;         //chooses the last element of sub-array to be the end pointer. it will be decremented until it finds a smaller element then pivot.


        while (start < end) {
            /*  while start is less than end we will increment and decrement the start and end pointers and if not we will swap the value of
            end pointer to the pivot element. */

            //increments start pointer until it finds greater element than pivot and until it is lesser than upper bound( otherwise it will give array out of bounds exception.)
            while (arr[start] <= pivot  && start<upr_bnd) {

                start++;

            }

            //decrements until it finds smaller element than pivot element.
            while (arr[end] > pivot) {
                end--;
            }

            //swaps the values of start and end pointer if start is lesser than end after incrementing and decrementing of respective pointers.
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end]=temp;
            }
        }

        /*
        swaps the values of pivot and end pointer if the start crosses the end pointer. it will create two sub-arrays , one on right of pivot containing
        elements greater than it.
        and one on left of pivot containing the smaller elements than pivot.
        */


        int temp=arr[lwr_bnd];
        arr[lwr_bnd] = arr[end];
        arr[end]=temp;

        //returns the end position which will be the pivot of next sub-array in next recursion.
        return end;
    }

    //Prints the array.
    public static void display_array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {


        int[] arr = {3,2,1,0,7,5,10,98};
        System.out.print("Array before sorting : ");
        display_array(arr);

        System.out.println();

        quick_sort(arr, 0, arr.length - 1);
        System.out.print("Array after sorting : ");
        display_array(arr);



    }
}
