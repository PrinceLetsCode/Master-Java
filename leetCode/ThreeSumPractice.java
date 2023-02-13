package leetCode;

import java.util.List;

public class ThreeSumPractice {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        threeSum(arr);
    }

    private static List<List<Integer>> threeSum(int[] arr) {
        int i=0;
        int j=1;
        int k=arr.length-1;
        while(i<arr.length && j<arr.length && k>0) {
            if (arr[i] + arr[j] + arr[k] == 0) {
                System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                i++;
                j++;
                k--;
            }
            else if (arr[i] + arr[j] + arr[k] > 0) {
                k--;
            }
            else {
                j++;
            }
        }
        return null;
    }
}
