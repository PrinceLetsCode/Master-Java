package PrinceLetsCode2.Array;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println(removeElement(nums,val));
    }

    private static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;
        while(j<nums.length){
            if(nums[j] == val){
                j++;
            }else{
                nums[i] = nums[j];
                i++;
                j++;
            }
        }

        return i;
    }
}
