package DataStructures.Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 ={1,2,3,4,5,6};
        System.out.println(findTheDifference(arr1,arr2));
    }

    private static List<List<Integer>> findTheDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> result = new ArrayList<>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }

        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();

        for (int n : set1){
            if(set2.contains(n) == false){
                ans1.add(n);
            }
        }
        for (int n : set2){
            if(set1.contains(n) == false){
                ans2.add(n);
            }
        }
        result.add(ans1);
        result.add(ans2);
        return result;
    }
}
