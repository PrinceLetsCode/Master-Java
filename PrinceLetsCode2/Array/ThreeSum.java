package PrinceLetsCode2.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }

    private static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++){
            if(i == 0 || nums[i] != nums[i-1]){
                int low = i+1;
                int high = nums.length-1;
                int sum = 0 - nums[i];

                while(low < high){
                    if(nums[low] + nums[high] == sum){
                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while(low < high && nums[low] == nums[low+1]){
                            low++;
                        }
                        while(low < high && nums[high] == nums[high-1]){
                            high--;
                        }
                        low++;
                        high--;
                    }
                    else if(nums[low] + nums[high] < sum){
                        low++;
                    }
                    else{
                        high--;
                    }
                }
            }
        }

        return result;

    }
}
