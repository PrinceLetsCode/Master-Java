package DataStructures.Tree;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        rotate(arr, 2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }


    private static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);

    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
