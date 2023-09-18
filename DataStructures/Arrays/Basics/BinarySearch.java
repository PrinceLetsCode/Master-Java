package DataStructures.Arrays.Basics;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        System.out.println(BinarySearch(arr, 6));
    }

    private static boolean BinarySearch(int[] arr, int target){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start +(end-start)/2;
            if(arr[mid]== target){
                return true;}

            else if(arr[mid]> target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
}

