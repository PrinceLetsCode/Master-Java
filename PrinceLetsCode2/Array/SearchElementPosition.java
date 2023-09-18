package PrinceLetsCode2.Array;

public class SearchElementPosition {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 5;
        System.out.println(searchElementPosition(arr,target));
    }

    private static int searchElementPosition(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return low;
    }
}
