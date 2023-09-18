package PrinceLetsCode2.Array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 5;
        System.out.println(binarySearch(arr, target));
    }

    private static int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return -1;
    }

    // recursive solution

    private static int binarySearch_recursive(int[] nums, int target, int low, int high){
        if(low > high){
            return -1;
        }

        int mid = low + (high - low)/2;

        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] < target){
            return binarySearch_recursive(nums, target, mid+1, high);
        }
        else{
            return binarySearch_recursive(nums, target, low, mid-1);
        }
    }
}
