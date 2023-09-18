package leetCode;

public class SubArrayProductLessThanK {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        System.out.println(numSubarrayProductLessThanKOptimized(nums, k));
    }


    // Bruteforce solution
    // time complexity: O(n^2)
    // space complexity: O(1)
    private static int numSubarrayProductLessThanK(int[] nums, int k) {
        int subArrCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int product = nums[i];
            if (product < k) {
                subArrCount++;
            }

            // for counting subArrays with more than 1 element
            for (int j = i + 1; j < nums.length; j++) {
                product *= nums[j];
                if (product < k) {
                    subArrCount++;
                } else {
                    break;
                }
            }
        }

        return subArrCount;
    }

    // Optimized solution
    // time complexity: O(n)
    // space complexity: O(1)

    private static int numSubarrayProductLessThanKOptimized(int[] nums, int k) {
        int subArrCount = 0;
        int product = 1;
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            product *= nums[right];

            while (product >= k && left <= right) {
                product /= nums[left];
                left++;
            }

            subArrCount += right - left + 1;
            right++;
        }

        return subArrCount;
    }

}
