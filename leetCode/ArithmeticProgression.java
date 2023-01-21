package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticProgression {
    public static void main(String[] args) {
        int[] nums = {-11349,-11652,-5895,-9228,-3471,-13773,-7410,-10743,-1956,-2562,-138,-13470,-5592,-10440,-1350,-1047,-12258,-3774,-2865,-2259,-11046,-8622,-4986,-744,-8016,-9531,-4683,-14076,165,-441,-7107,-9834,-7713,-11955,-12561,-12864,-5289,-6501,-10137,-3168,-4077,-6804,-13167,-8925,-1653,-6198,-4380,-8319};
        System.out.println(canMakeArithmeticProgression(nums));
        System.out.println(canMakeArithmeticProgression_(nums));
    }

    private static boolean canMakeArithmeticProgression(int[] nums) {
        List<Integer> difference=new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            int diff = nums[i + 1] - nums[i];
            difference.add(diff);
        }
        System.out.println(difference);
        for (int i = 0; i < difference.size()-1; i++) {
            int a = difference.get(i);
            int b = difference.get(i + 1);
            if (a != b) {
                return false;
            }
        }
        return true;
    }

    private static boolean canMakeArithmeticProgression_(int[] arr) {
        if(arr.length<3){
            return true;
        }
        Arrays.sort(arr);
        int diff = arr[0]-arr[1];
        for(int i = 2; i < arr.length; i++){
            if(arr[i-1] - arr[i] != diff){
                return false;
            }
        }
        return true;
        
    }
}
