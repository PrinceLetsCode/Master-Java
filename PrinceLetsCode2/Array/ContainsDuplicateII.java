package PrinceLetsCode2.Array;

import java.util.Map;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3};
        System.out.println(containsNearbyDuplicate(arr, 2));
    }

    private static boolean containsNearbyDuplicate(int[] arr, int k) {
        Map<Integer,Integer> map = new java.util.HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                int index = map.get(arr[i]);
                if(i - index <= k) {
                    return true;
                }
            }
            map.put(arr[i], i);

        }

        return false;
    }
}
