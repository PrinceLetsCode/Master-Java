package PrinceLetsCode2.Array;

public class SuffixSumConcept {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = suffixSum(nums);

        for(int i : result) {
            System.out.print(i + " ");
        }
    }

    private static int[] suffixSum(int[] nums) {
        int n = nums.length;
        int[] suffixSum = new int[n];
        suffixSum[n - 1] = nums[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + nums[i];
        }

        return suffixSum;
    }
}
