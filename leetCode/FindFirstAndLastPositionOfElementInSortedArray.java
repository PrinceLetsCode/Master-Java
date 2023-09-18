package leetCode;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
//        int[] result = searchRange(arr, 8);
//        System.out.println("First method");
//        for (int i : result) {
//            System.out.print(i + " ");
//        }

        System.out.println();
        System.out.println("Second method");
        int [] result2 = searchRange2(arr,8);
        for (int i : result2) {
            System.out.print(i + " ");
        }
    }


//    time complexity: O(logn)


    private static int[] searchRange(int[] nums, int target) {
        int left= 0;
        int right = nums.length - 1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                int start = mid;
                int end = mid;
                while(start>=0 && nums[start]==target){
                    start--;
                }
                while(end<nums.length && nums[end]==target){
                    end++;
                }
                return new int[]{start+1,end-1};
        }
            else if(nums[mid]>target){
            right = mid-1;
        }
        else{
            left = mid+1;
        }
    }
        return new int[]{-1,-1};
    }


//=================================================================================================================//

    public static int[] searchRange2(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }


    private static int findFirst(int[] nums, int target){
        int result = -1;
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = low + ((high-low)/2);

            if (nums[mid] < target){
                low = mid +1;
            } else if (nums[mid] > target){
                high = mid - 1;
            } else { // nums[mid] == target
                result = mid;

                // because nothing after mid
                // can be the first occurance of target.
                //maybe mid is the first occurance , maybe not
                //so let's narrow the target for [0...mid-1] and find out
                high = mid - 1;

            }
        }

        return result;
    }

    private static int findLast(int[] nums, int target){

        int result = -1;
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){

            int mid = low + (high-low)/2;

            if (nums[mid] < target){
                low = mid +1;
            } else if (nums[mid] > target){
                high = mid - 1;
            } else { // nums[mid] == target
                result = mid;
                // because nothing before mid
                // can be the last occurance of target.
                //maybe mid is the last occurance , maybe not
                //so let's narrow the target for [mid+1...high] and find                   // out
                low = mid + 1;

            }
    }
        return result;

    }

}
