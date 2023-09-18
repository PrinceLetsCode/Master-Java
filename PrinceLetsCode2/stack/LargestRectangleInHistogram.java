package PrinceLetsCode2.stack;

import java.util.Stack;
public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));
    }


     // using array as stack. Time complexity: O(n)
    // readable code
    private static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] stack = new int[n+1];
        int top = 0;
        int maxArea = 0;
        int i = 0;
        while(i < n){
            if(top == 0 || heights[stack[top-1]] <= heights[i]){
                stack[top++] = i++;
            }else{
                int height = heights[stack[--top]];
                int width = top == 0 ? i : i - stack[top-1] - 1;
                maxArea = Math.max(maxArea, height * width);
            }
        }
        while(top > 0){
            int height = heights[stack[--top]];
            int width = top == 0 ? i : i - stack[top-1] - 1;
            maxArea = Math.max(maxArea, height * width);
        }
        return maxArea;
    }
}
