package Algorithms.sorting;

public class Bubble_Sort {


    //CLASSIC VERSION OF BUBBLE SORT.
    public static void bubble_sort(int []arr) {

        int n=arr.length;
        /*
        outer loop is for passes. it runs for n-1 times because at after the completion of n-1 passes the
        remaining element will already be sorted.
        */
        for (int i = 0; i < n-1; i++) {

            //inner loop is for comparison of adjacent elements.
            //this loop also runs for n-1 times as after n-1 iterations , the remaining element will already be sorted.
            for (int j = 0; j < n-1; j++) {

                //now we compare the current element with next element.
                //if the current element is greater than next element, then we swap them and move forward.
                //if the current element is not greater than next element, then we move forward without swapping.
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j]=temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }



    //OPTIMIZED VERSION OF BUBBLE SORT.
    public static void optimized_bubble_sort(int[] arr) {


        /*
        outer loop is for passes. it runs for n-1 times because at after the completion of n-1 passes the
        remaining element will already be sorted.

        BUT, there are cases when array is sorted before all the passes , in that cases we don't need to run the outer loop till n-1 times.
        so for tackling this problem we  use flag which keep tracks of whether there have been swapping inside the inner loop or not.

        if there have been swapping inside the inner loop, it means the array is not sorted yet.
        if there have been no swapping inside the inner loop , it means the array is sorted and we no more need to run the outer loop.

        */
        for (int i = 0; i < arr.length-1; i++) {

            // swap for marking the swaps inside the inner loop
                boolean swap=false;

                /* the inner loop runs for n-1-i times because in normal approach it also compares the elements which are already
                    sorted or the elements which are no more required to be compared in order to  sort the array.
                */
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {  //swap elements when the current element is greater than next element.
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j]=temp;
                    swap=true;   //swap flag to true meaning swapping happened and array is not sorted yet.
                }
            }

            //if swapping doesn't happen meaning the array is  sorted .
            // we break the outer loop
            if (!swap) {
                break;
            }
        }

        //print the sorted array.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 29, 25, 8, 32, 17, 40};
//        optimized_bubble_sort(arr);

    }
}
