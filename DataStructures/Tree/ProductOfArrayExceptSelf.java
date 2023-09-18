package DataStructures.Tree;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ans = productExceptSelf_opt(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    private static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[nums.length];
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            int prod = 1;
            for(int j=0; j<nums.length;j++){
                if(i!=j){
                    prod= prod*nums[j];
                }
            }
            result[k] = prod;
            k++;
        }

        return result;

    }

    // Optimized solution without using division
     private static int[] productExceptSelf_opt(int[] nums) {
        int n = nums.length;
        int[] result = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        for(int i = 1; i < nums.length; i++){
            left[i] = left[i-1]*nums[i-1];
        }

        right[n-1] = 1;
        for(int i = n-2; i >= 0; i--){
            right[i] = right[i+1]*nums[i+1];
        }

        for(int i = 0; i < nums.length; i++){
            result[i] = left[i]*right[i];
        }

        return result;
     }
}
