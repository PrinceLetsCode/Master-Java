package PrinceLetsCode2.Array;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = productExceptSelfOptimized(nums);

        for(int i : result) {
            System.out.print(i + " ");
        }
    }

    // brute force
    private static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            int product = 1;
            for(int j = 0; j < nums.length; j++) {
                if(i != j) {
                    product *= nums[j];
                }
            }
            res[i] = product;
        }

        return res;
    }


    // optimized solution

    private static int[] productExceptSelfOptimized(int[] nums) {
        int[] res = new int[nums.length];

        int[] prefixProduct = new int[nums.length + 1];
        int[] suffixProduct = new int[nums.length + 1];


        prefixProduct[0] = 1;
        suffixProduct[suffixProduct.length-1] = 1;

        for(int i = 1; i < nums.length; i++) {
            prefixProduct[i] = prefixProduct[i-1] * nums[i-1];
        }

        for(int i = suffixProduct.length - 2; i >= 0; i--) {
            suffixProduct[i] = suffixProduct[i+1] * nums[i];
        }

        for(int i = 0; i < prefixProduct.length-1; i++) {
            res[i] = prefixProduct[i] * suffixProduct[i+1];
        }


        return res;
    }

    // optimized solution with O(1) space complexity

    private static int[] productExceptSelfOptimized2(int[] nums) {
        int[] res = new int[nums.length];

        res[0] = 1;

        for(int i = 1; i < nums.length; i++) {
            res[i] = res[i-1] * nums[i-1];
        }

        int suffixProduct = 1;

        for(int i = nums.length - 1; i >= 0; i--) {
            res[i] = res[i] * suffixProduct;
            suffixProduct *= nums[i];
        }

        return res;
    }


}
