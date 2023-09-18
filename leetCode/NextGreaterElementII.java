package leetCode;

import java.util.Stack;

public class NextGreaterElementII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(nextGreaterElements(nums));
    }

    private static int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2 * nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i % nums.length]) {
                stack.pop();
            }
            res[i % nums.length] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i % nums.length]);
        }

        return res;
    }
}
