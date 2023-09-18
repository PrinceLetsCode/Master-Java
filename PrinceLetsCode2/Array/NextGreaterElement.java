package PrinceLetsCode2.Array;

import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] num = {4,3,5,8,7};
        int[] result = nextGreaterElement1(num);

        for(int i : result) {
            System.out.print(i + " ");
        }
    }

    private static int[] nextGreaterElement(int[] num) {
        int[] result = new int[num.length];
        Arrays.fill(result, -1);


        for(int i = 0; i < num.length; i++) {
           boolean found = false;
            int j = i + 1;
            while(j < num.length) {
                if(num[i] < num[j]) {
                    result[i] = num[j];
                    found = true;
                    break;
                }
                j++;
            }

            if(!found){
                j = 0;
                while(j < i) {
                    if(num[i] < num[j]) {
                        result[i] = num[j];
                        break;
                    }
                    j++;
                }
            }
        }

        return result;
    }

    // optimized solution

    private static int[] nextGreaterElement1(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);

        java.util.Stack<Integer> stack = new java.util.Stack<>();

        for (int i = 0; i < nums.length * 2; i++) {
            int num = nums[i % nums.length];
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                result[stack.pop()] = num;
            }
            if (i < nums.length) {
                stack.push(i);
            }

        }
        return result;

    }
}
