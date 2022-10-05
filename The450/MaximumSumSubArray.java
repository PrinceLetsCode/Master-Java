package The450;

public class MaximumSumSubArray {

    public static void Brute_force(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum=0;
                for (int k = i; k <=j; k++) {
                    sum = sum + arr[k];
                }

                if (sum > max) {
                    max=sum;
                }
            }
        }

        System.out.println(max);
    }

/*    public static void Brute_force_2(int[] arr) {
        int max = Integer.MIN_VALUE;

        int[] pre_sum = new int[arr.length + 1];

        pre_sum[0] = 0;
        for (int i = 1; i <= arr.length; i++) {
            pre_sum[i] = pre_sum[i - 1] + arr[i];
        }

        for (int i = 1; i <= arr.length; i++) {
            for (int j = i; j <= arr.length; j++) {
                int sum = pre_sum[j] - pre_sum[i - 1];
                if (sum > max) {
                    max=sum;
                }
            }
        }

        System.out.println(max);

    }*/


    // Doesn't work if all the elements in the array are negative.
    public static void Kadanes_algo(int[] arr) {


        int max_sum=0;
        int cur_sum=0;

        for (int i = 0; i < arr.length; i++) {
            cur_sum = cur_sum + arr[i];

            if (cur_sum > max_sum) {
                max_sum = cur_sum;
            }

            if (cur_sum < 0) {
                cur_sum = 0;
            }
        }

        System.out.println(max_sum);

    }


    // works for if all are negative elements in array.

    public static int maxSubArray(int[] nums) {
        int max_sum,cur_sum;
        max_sum=cur_sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            cur_sum=Math.max(nums[i],cur_sum+nums[i]);
            max_sum=Math.max(cur_sum,max_sum);
        }
        return max_sum;
    }


    public static void main(String[] args) {

        int[] arr = {-5, 4, 6, -3, 4, -1};
//        Kadanes_algo(arr);
        System.out.println(maxSubArray(arr));
        
    }

}
