package PrinceLetsCode2.Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] result = twoSum(arr, 9);
        System.out.println(result[0] + " " + result[1]);
    }

    // brute force
    private static int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];
        for (int j = 0; j < arr.length; j++) {
            for (int k = j + 1; k < arr.length ; k++) {
                if (arr[j] + arr[k] == target) {
                    result[0] = j;
                    result[1] = k;
                    return result;
                }
            }
        }
        return result;
    }

    // optimized

    private static int[] twoSumOptimized(int[] arr, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < arr.length; j++) {
            int complement = target - arr[j];
            if (map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = j;
                return result;
            }
            map.put(arr[j], j);
        }

        return result;
    }
}
