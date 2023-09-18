package leetCode;

public class ApplyOperationsToAnArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1};
        int[] result = applyOperations(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    private static int[] applyOperations(int[] nums) {
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
                i += 2;
            } else {
                i++;
            }
        }

        // now shifting all zeros to the end.
        int j = 0;
        int k = 0;
        while (k < nums.length) {
            if(nums[k] != 0){
                int temp  = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                j++;
                k++;
            }
            else{
                k++;
            }
        }

        return nums;
    }
}
