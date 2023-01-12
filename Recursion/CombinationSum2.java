package Recursion;

import java.util.*;

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> list = combinationSum(arr, target);
        System.out.println(list);
    }

    private static List<List<Integer>> combinationSum(int[] inputArr, int target){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(inputArr);
        findCombinations(0,inputArr,target,ans,new ArrayList<>());
        return new ArrayList<>(ans);
    }

    private static void findCombinations(int ind, int[] arr, int tar, List<List<Integer>> finResult, List<Integer> ds){
        // Base Case
        // If target becomes 0, then we have found a combination

            if (tar == 0) {
                finResult.add(new ArrayList<>(ds));
                return;
            }


        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) {
                continue;
            }
            if (arr[i] <= tar) {
                ds.add(arr[i]);
                findCombinations(i + 1, arr, tar - arr[i], finResult, ds);
                ds.remove(ds.size() - 1);
            }
        }
    }
}
