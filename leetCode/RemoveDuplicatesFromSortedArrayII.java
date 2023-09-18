package leetCode;

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(arr));
    }

    private static int removeDuplicates(int[] nums) {
       int i = 0;
       int j = 1;
        int count = 1;

         while (j < nums.length) {
              if (nums[i] == nums[j]) {
                count++;
                if (count <= 2) {
                     i++;
                     nums[i] = nums[j];
                }
              } else {
                count = 1;
                i++;
                nums[i] = nums[j];
              }
              j++;
         }
         return i + 1;
    }

    private static void leftShift(int[] arr, int j, int length) {
        for (int i = j; i < length - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }
}
