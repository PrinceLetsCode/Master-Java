package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> list = combinationSum(arr, target);
        System.out.println(list);
    }

    public static List<List<Integer>> combinationSum(int[] inputArr, int target){
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0,inputArr,target,ans,new ArrayList<>());
        return ans;
    }

    private static void findCombinations(int ind, int[] arr, int tar, List<List<Integer>> finResult, List<Integer> ds){
        // Base Case
        // If target becomes 0, then we have found a combination
        if (ind == arr.length) {
            if (tar == 0) {
                finResult.add(new ArrayList<>(ds));
            }
            return;
        }

        // this is the pick case
        if (arr[ind] <= tar) {
            ds.add(arr[ind]);
            findCombinations(ind,arr,tar-arr[ind],finResult,ds);
            ds.remove(ds.size()-1);
        }
        // this is the not pick case
        findCombinations(ind+1,arr,tar,finResult,ds);
    }
}
