package PrinceLetsCode2.Array;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(arr));
    }


    // brute force. Time complexity: O(n^2)
    private static int maxArea(int[] height) {
        int maxArea = 0;
        int n = height.length;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j-i));
            }
        }

        return maxArea;
    }

    // optimized solution. Time complexity: O(n)

    private static  int maxArea_optimized(int[] height){
        int maxArea = 0;

        int i = 0;
        int j = height.length - 1;

        while(i < j){
            maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j-i));
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }

        return maxArea;
    }
}
