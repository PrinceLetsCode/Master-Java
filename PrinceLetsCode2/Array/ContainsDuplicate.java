package PrinceLetsCode2.Array;

import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }

    private static boolean containsDuplicate(int[] arr) {
        Set<Integer> set = new java.util.HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])) {
                return true;
            } else {
                set.add(arr[i]);
            }
        }

        return false;
    }

    // sorting

    private static boolean containsDuplicate_2(int[] arr) {
        java.util.Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    // using map
    private static boolean containsDuplicate_3(int[] arr) {
        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                return true;
            } else {
                map.put(arr[i], 1);
            }
        }
        return false;
    }

}
