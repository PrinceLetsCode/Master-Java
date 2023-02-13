package leetCode.Interview150.Easy;

public class AllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void moveZeroes(int[] nums) {
        int i=0;
        int j=0;

        while (j < nums.length) {
            if (nums[j] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i]=temp;
                i++;
                j++;
            }
            else {
                j++;
            }
        }

    }
}
