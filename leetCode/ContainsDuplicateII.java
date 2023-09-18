package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;

        System.out.println(containsDuplicate_optimized2(nums, k));
    }


    // brute force solution
    // time complexity: O(n^2)
    // space complexity: O(n)
    private static boolean containsDuplicate(int[] nums, int k) {
        Map<Integer, ArrayList<Integer>> map = new java.util.HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                ArrayList<Integer> list = map.get(nums[i]);
                // add the index of the duplicate element
                list.add(i);
                if (list.size()>1){
                    // check if the difference between the indices is less than or equal to k
                    for (int j = 0; j < list.size()-1; j++) {
                        if(list.get(list.size()-1)-list.get(j)<=k){
                            return true;
                        }
                    }
                }
            }
            else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            }
        }

        return false;
    }


    // time complexity: O(n^2)
    // space complexity: O(1)
    private static  boolean containsDuplicate_optimized(int[] nums, int k) {


        for(int i = 0 ; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]==nums[j] && j-i<=k){
                    return true;
                }
            }
        }

        return false;
    }

    // time complexity: O(n)
    // space complexity: O(n)

    private static boolean containsDuplicate_optimized2(int[] nums, int k) {  // Create a HashSet to store the last k elements seen
        Set<Integer> set = new HashSet<>();

        // Iterate over each element in the nums array
        for(int i = 0; i < nums.length; i++){
            // If we've seen more than k elements, remove the oldest one from the set
            if(i > k) {
                set.remove(nums[i-k-1]);
            }

            // If we've already seen the current element, return true
            if(!set.add(nums[i])) {
                return true;
            }
        }

        // If we haven't seen any duplicates, return false
        return false;
    }

    // time complexity: O(n)
    // space complexity: O(n)

    private static boolean containsDuplicate_optimized3(int[] nums, int k) {
        Map<Integer, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            } else {
                map.put(nums[i], i);
            }
        }

        return false;
    }


}
