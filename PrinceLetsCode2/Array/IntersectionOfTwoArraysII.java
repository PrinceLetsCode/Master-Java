package PrinceLetsCode2.Array;

import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        int[] result = intersect(arr1, arr2);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] intersect(int[] arr1, int[] arr2) {
        List<Integer> result = new java.util.ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;

        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] == arr2[j]) {
                result.add(arr1[i]);
                i++;
                j++;
            } else if(arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] res = new int[result.size()];

        for(int k = 0; k < result.size(); k++) {
            res[k] = result.get(k);
        }

        return res;
    }
}
