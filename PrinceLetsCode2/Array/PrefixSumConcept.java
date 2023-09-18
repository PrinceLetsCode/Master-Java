package PrinceLetsCode2.Array;

public class PrefixSumConcept {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = prefixSum(nums);

        for(int i : result) {
            System.out.print(i + " ");
        }
    }

    private static int[] prefixSum(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for(int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        return prefixSum;
    }
}
