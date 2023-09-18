package DynamicProgramming;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(rob(nums));
//        rob(A);
    }

    private static int rob(int[] nums) {

        int[] first = new int[nums.length-1];

        for (int i = 1; i < nums.length; i++) {
            first[i-1] = nums[i];
            System.out.println(first[i-1]);
        }

        System.out.println();



        int[] last = new int[nums.length-1];

        for (int i = 0; i < nums.length-1; i++) {
            last[i] = nums[i];
            System.out.println(last[i]);
        }

        return Math.max(rob(first, first.length - 1), rob(last, last.length - 1));
    }

    private static int rob(int[] nums, int ind) {
        if (ind < 0) {
            return 0;
        }
       int left = rob(nums, ind - 2) + nums[ind];
        int right = rob(nums, ind - 1);

        return Math.max(left, right);
    }
}
