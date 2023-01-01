package CodeChef;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    // time complexity: O(n)
    // two pointer approach
    public static int maxArea(int[] height) {
        // maxArea for storing the maximum area
        int maxArea = 0;

        // left and right pointers
        int i = 0;
        int j = height.length - 1;


        // traverse till i<j
        while(i < j){
            // calculate the area between i and j and store it in area variable.
            // we need to find the minimum height between i and j and multiply it with the distance between i and j.
            int area = Math.min(height[i],height[j]) * (j - i);

            // update maxArea if area is greater than maxArea
            maxArea = Math.max(maxArea,area);

            // if height[i] is less than height[j], then we need to move i to the right
            if(height[i] < height[j]){
                i++;
            }else{
                // else we need to move j to the left
                j--;
            }
        }
        // return maxArea
        return maxArea;
    }
}
