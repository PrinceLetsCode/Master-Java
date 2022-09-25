package leetCode;

// leetCode #35

public class SearchInsertPosition {

/*
      this algorithm has the time complexity of O(n)
      it can be optimized.

    public static int SearchIndex(int []nums, int target)
    {
                int index=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                index=i;
            else if ( target>nums[i]) {
                index=i+1;
            }
        }

        return index;
    }*/


    public static int SearchIndex(int []nums, int target) {  // this function have o(logn) time complexity.
        int left=0;
        int right=nums.length-1;
        if(target<=nums[0])return 0;
        if(target>nums[right])return right+1;

        int mid;
        while(left<=right)
        {
            mid = (left+right)/2;
            if(target<=nums[mid] && target>nums[mid-1])return mid;
            if(nums[mid]<target)left=mid+1;
            else right=mid-1;
        }
        return -1;
    }



    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7};
        System.out.println(SearchIndex(arr, 5));

    }

}
