package leetCode;

import java.util.LinkedList;
import java.util.List;

public class FindAllTheNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = findDisappearedNumbers2(nums);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        int [] checkArr = new int[nums.length + 1];

        List<Integer> result = new LinkedList<Integer>();

        for(int i = 0; i < nums.length; i++){
            checkArr[nums[i]]++;
        }

        for(int i = 1; i < checkArr.length; i++){
            if(checkArr[i] == 0){
                result.add(i);
            }
        }

        return result;
    }

    // using set
    private static List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> result = new LinkedList<Integer>();

        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;

            if(nums[index] > 0){
                nums[index] = -nums[index];
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                result.add(i + 1);
            }
        }

        return result;
    }
}
