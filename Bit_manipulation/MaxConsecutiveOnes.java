package Bit_manipulation;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                max = (max > count) ? max : count;
                count = 0;
            } else {
                count++;
            }
        }
        max = (max > count) ? max : count;
        return max;
    }
}
