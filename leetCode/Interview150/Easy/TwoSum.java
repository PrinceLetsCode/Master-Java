package leetCode.Interview150.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int []nums,int target){
        //create an array to store the result.
        int []out=new int[2];

        //sorting the array so that we can use two pointer approach.
        Arrays.sort(nums);

        // left pointer will point to the first element of the array.
        int left=0;
        // right pointer will point to the last element of the array.
        int right = nums.length - 1;

        // loop will run until left is less than right.
        while (left < right) {

            // storing the sum of the two numbers.
            int sum = nums[left] + nums[right];

            // if the sum is equal to the target we will store the indices of the two numbers in the result array.
            if (sum == target) {

                // storing the indices of the two numbers in the result array.
                out[0]=left;
                out[1]=right;

                // we will return the result array.
                return out;
            }
            // if the sum is less than the target we will increment the left pointer. so that we can get closer to the sum.
            else if (sum < target) {
                left++;
            }
            // if the sum is greater than the target we will decrement the right pointer. so that we can get closer to the sum.
            else {
                right--;
            }
        }

        // if we don't find any two numbers with the given sum we will return the result array.
        return out;
    }


    //using hashmap
    public static int[] two_sum_using_hashMap(int[] nums, int target) {
        // create an array to store the result.
        int res[]=new int[2];

        // create a hashmap to store the numbers and their indices.
        HashMap<Integer,Integer> map=new HashMap<>();

        // loop will run for all the elements of the array.
        for(int i=0;i<nums.length;i++)
        {
            // if the map contains the difference of the target and the current element we will store the indices of the two numbers in the result array.
            int temp=target-nums[i];

            if(map.containsKey(temp))
            {

                // storing the indices of the two numbers in the result array.
                res[0]=map.get(temp);
                res[1]=i;

                // we will return the result array.
                return res;
            }

            // if the map doesn't contain the difference of the target and the current element we will add the current element and its index to the map.
            else
                map.put(nums[i],i);
        }

        // if we don't find any two numbers with the given sum we will return the result array.
        return res;


    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int target = 6;

        int []result=two_sum_using_hashMap(arr,target);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
