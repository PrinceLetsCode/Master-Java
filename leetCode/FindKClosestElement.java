package leetCode;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(findClosestElements(arr, 4, 3));
    }

    private static List<Integer> findClosestElements(int[] arr, int k, int x) {
       List<Integer> result = new ArrayList<>();
       int i = 0;
       int j= arr.length-1;
       while(j-i>=k){
        if (x - arr[i] <= arr[j] - x) {
            j--;
        } else {
            i++;
        }
       }
         for(int m=i;m<=j;m++){
              result.add(arr[m]);
         }
        return result;


    }
}
