package PrinceLetsCode2.Array;

import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        int[] result = intersection(arr1, arr2);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] intersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new java.util.HashSet<>();
        Set<Integer> set2 = new java.util.HashSet<>();

        for(int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }

        for(int i = 0; i < arr2.length; i++) {
            set2.add(arr2[i]);
        }

        set1.retainAll(set2);

        int[] result = new int[set1.size()];

        int i = 0;

        for(int num : set1) {
            result[i++] = num;
        }

        return result;
    }
}
