package leetCode;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {0,-10,1,3,-20};
        System.out.println(firstMissingPositive4(nums));

    }


    // using extra space
    private static int firstMissingPositive(int[] nums) {
        int [] countArray = new int[nums.length+1];

        for (int i = 0;i < nums.length;i++){
            if(nums[i]>0 && nums[i]<=nums.length){
                countArray[nums[i]]++;
            }
        }

        for (int i = 1;i < countArray.length;i++){
            if(countArray[i]==0){
                return i;
            }
        }

        return nums.length+1;
    }

    // using sorting

    private static int firstMissingPositive2(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        for (int i = 0;i < nums.length;i++){
            if(nums[i]>0){
                if(nums[i]==count){
                    count++;
                }else if(nums[i]>count){
                    return count;
                }
            }
        }
        return count;
    }

    //optimized solution

    private static int firstMissingPositive3(int[] nums) {
        int n = nums.length;
        boolean containsOne = false;
        for(int i = 0; i < n; i++) {
            if(nums[i] == 1) {
                containsOne = true;
            }
            if(nums[i] <= 0 || nums[i] > n) {
                nums[i] = 1;
            }
        }
        if(!containsOne) {
            return 1;
        }
        for(int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        for(int i = 0; i < n; i++) {
            if(nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }

    // optimized solution 2

    private static int firstMissingPositive4(int[] nums) {

        int i = 0;
        while(i < nums.length){
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i]-1]){
                swap(nums, i, nums[i]-1);
            }else{
                i++;
            }
        }

        for(i = 0; i < nums.length; i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }

        return nums.length+1;
    }

    private static void swap(int[] nums, int i, int i1) {
        int temp = nums[i];
        nums[i] = nums[i1];
        nums[i1] = temp;
    }
}
