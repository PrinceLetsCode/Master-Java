package leetCode;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search2(arr, 1));
    }

    // time complexity: O(log n) m
    private static int search(int[] nums, int target) {
        int i=0;
        int j= nums.length-1;
        while(i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] >= nums[i]) {
                if (target >= nums[i] && target < nums[mid]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[j]) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
        }
        return -1;
    }

    private static int search2(int[] nums, int target) {
        // 1. find the pivot or the smallest element
        int i=0;
        int j= nums.length-1;
        while(i < j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] > nums[j]) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        int pivot = i;
        // 2. search the target
        if (nums[pivot] == target) {
            // if the pivot is the target return the pivot
            return pivot;
        }

        // if target is greater than or equal to the pivot and less than or equal to  the last element
        if(target>=nums[pivot] && target<=nums[nums.length-1])
        {
            // search in the right side of the pivot
            i=pivot;
            j=nums.length-1;
        }
        else
        {
            // search in the left side of the pivot
            i=0;
            j=pivot-1;
        }
            // 3. binary search in the left or right side of the pivot
           while(i<=j)
            {
                int mid = i + (j - i) / 2;
                if (nums[mid] == target) {
                    return mid;
                }
                if(nums[mid]>target)
                {
                    j=mid-1;
                }
                else
                {
                    i=mid+1;
                }
            }
        return -1;
    }

}
