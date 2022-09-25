package Algorithms.searching;

public class Binary_Search {

    public static void binarySearch_iterativeMethod(int[] arr, int key) {

        // we will return or terminate the program if the array is empty.
        if (arr.length==0) {
            System.out.println("Array is empty");
            return;
        }


         /*
         creating two variables(low and high) to store the start and end index of the array.
         we will find the element between the low and high index.
         */
        int low=0;
        int high=arr.length-1;

        /*
        we will run this loop until high index is not equal to low index.
        when high index is equal to low index either the key would have been found and printed or key wouldn't be found
        */
        while (high>=low) {

            //finding the mid index of the array. it will divide the array in two parts.
            //if the key is less than the mid-index-element then we will search in the left part of the array.
            //if the key is greater than the mid-index-element then we will search in the right part of the array.
            int mid = (high + low) / 2;


            //if we find key at mid index then we will print the index of the key and terminate the program.
            if (key == arr[mid]) {
                System.out.println("found key " + key + " at " + mid + " position");
                return;
            }

            /*
            if the key is less than the mid-index-element then we will search in the left part of the array by
            changing the high-index to mid-1.
            */
            else if (key < arr[mid]) {
                high = mid - 1;
            }

            /*
            if the key is greater than the mid-index-element then we will search in the right part of the array by
            changing the low-index to mid+1.
            */
            else {
                low=mid+1;
            }
        }

        //ultimately when the high and low index will be same the mid will be also equal to the high and low and we will find
        //our key there and if not, then we will print that key is not found.

    }



    public static int binarySearch_recursiveMethod(int[] arr, int key,int low,int high) {

        if (high >= low) {
            int mid=(high+low)/2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return binarySearch_recursiveMethod(arr, key, low, mid - 1);
            }

            return binarySearch_recursiveMethod(arr, key, mid + 1, high);

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int key=2;
       /* binarySearch_iterativeMethod(arr, 6);*/


        int x = binarySearch_recursiveMethod(arr, key, 0, arr.length - 1);
        System.out.println("found key " + key + " at " + x + " position");

    }
}