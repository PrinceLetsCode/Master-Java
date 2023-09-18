package leetCode;

public class FindMinimumInSortedArrayPartII {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {
        int i=0;
        int j= nums.length-1;
        while(i < j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] > nums[j]) {
                i = mid + 1;
            }else if(nums[mid] == nums[j]){
                j--;
            }
            else {
                j = mid;
            }
        }
        return nums[i];
    }
}
