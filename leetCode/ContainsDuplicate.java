package leetCode;


//Given an integer array nums, return true if any value appears at least twice in the array,
//and return false if every element is distinct.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
  /*      Set<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }


        if(hashSet.size()!=nums.length){
            return true;
        }
        else return false;*/


        Set<Integer> set = new HashSet<Integer>();
        for(int i : nums)
            if(!set.add(i))// if there is same
                return true;
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 5, 6, 6};
        containsDuplicate(arr);
    }
}
