package PrinceLetsCode2.Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumTest {

    public static void main(String[] args) {
        int[] nums = {0,-1,2,-3,1};
        int target = -2;

        int[] res = twoSumTest(nums,target);

        for(int i = 0; i< res.length;i++){
            System.out.println(res[i]);
        }
    }


    private static int[] twoSumTest(int[] nums, int target){

        int[] res = new int[2];

        for(int i = 0; i < nums.length; i++){
            for(int j= i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    res[0] = nums[i];
                    res[1] = nums[j];
                    return res;
                }
            }
        }

        return new int[]{-1,-1};
    }

    private static int[] twoSumTestOptimized(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                res[0] = nums[i];
                res[1] = target-nums[i];
                return res;
            }else{
                map.put(nums[i],i);
            }
        }

        return new int[]{-1,-1};
    }
}
