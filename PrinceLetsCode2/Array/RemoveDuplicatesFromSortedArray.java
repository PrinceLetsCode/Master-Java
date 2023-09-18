package PrinceLetsCode2.Array;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,5};
        System.out.println(removeDuplicates(arr));  
    }

    private static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;

        while(j<nums.length){
            if (nums[i] == nums[j]) {
                j++;
            }else{
                int temp = nums[i + 1];
                nums[i+1] = nums[j];
                nums[j] = temp;

                i++;
                j++;
            }
        }

        return i+1;
    }
}
