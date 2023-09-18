package PrinceLetsCode2.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {4,1,-1,2,-1,2,3};
        for(int i : topKFrequent(nums, 2)) {
            System.out.print(i + " ");
        }
    }

    private static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int count = map.get(nums[i]);
                map.put(nums[i], count + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int[] result = new int[k];

        for(int i = 0; i < k; i++) {
            int max = 0;
            int maxKey = 0;
            for(int key : map.keySet()) {
                if(map.get(key) > max) {
                    max = map.get(key);
                    maxKey = key;
                }
            }
            result[i] = maxKey;
            map.remove(maxKey);
        }

        return result;

    }


    //optimized solution

    private static int[] topKFrequent_optimized(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer>[] bucket = new List[nums.length+1];
        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        int[] result = new int[k];
        int index = 0;
        for (int i = bucket.length-1; i >= 0 && index < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    result[index++] = num;
                }
            }
        }

        return result;

    }
}
