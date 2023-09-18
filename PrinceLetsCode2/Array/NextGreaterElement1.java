package PrinceLetsCode2.Array;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement1 {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        int[] result = nextGreaterElement(nums1, nums2);

        for(int i : result) {
            System.out.print(i + " ");
        }
    }

    private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        Arrays.fill(result, -1);

        for(int i = 0; i < nums1.length; i++) {
            int j = 0;
            while(j < nums2.length) {
                if(nums1[i] == nums2[j]) {
                    break;
                }
                j++;
            }

            while(j < nums2.length) {
                if(nums1[i] < nums2[j]) {
                    result[i] = nums2[j];
                    break;
                }
                j++;
            }
        }

        return result;
    }

    // optimized solution

    private static int[] nextGreaterElement1(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        for(int i = nums2.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && nums2[i] > stack.peek()) {
                stack.pop();
            }

            if(!stack.isEmpty()) {
                result[i] = stack.peek();
            }

            stack.push(nums2[i]);
        }


        return result;
    }
}
