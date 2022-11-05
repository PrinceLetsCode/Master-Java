package leetCode;

import java.util.*;

public class ThreeSum {


    public static List<List<Integer>> find_three_sum_brute(int []nums)  // Time complexity: O(n^3)
    {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    if(nums[i]+nums[j]+nums[k]==0)
                    {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        if (!result.contains(temp))
                        {
                            result.add(temp);
                        }

                    }
                }
            }
        }

        return result;

    }

    // Time Complexity: O(n^2)
    public static List<List<Integer>> find_three_sum(int[] nums) {

        // create a list of list to store the result
        List<List<Integer>> result = new ArrayList<>();

        // sort the array so that we can use three pointer approach.
        Arrays.sort(nums);


        // we will use three pointer approach
        // we will fix one pointer and then use two pointer approach to find the other two numbers
        // i is less than length-2 because we need to have two more elements to the right of i to get the sum.
        for (int i = 0; i < nums.length - 2; i++) {

            // if we have duplicate elements we will skip them. so that we can get unique triplets.
            if (i!=0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // we will use two pointer approach to find the other two numbers.
            // low pointer will point to the element next to i
            int low=i+1;

            //high is the last element of the array.
            int high=nums.length-1;


            // we will use two pointer approach to find the other two numbers within the sub-array.
            while(low<high){

                // storing the sum of the three numbers.
                int sum=nums[i]+nums[low]+nums[high];
                if(sum==0){
                    // if the sum of the three numbers is equal to zero we will add them to the result list.
                    result.add(List.of(nums[i],nums[low],nums[high]));

                    // we will increment the low pointer and decrement the high pointer.
                    low++;
                    high--;

                    // if we have duplicate elements we will skip them. so that we can get unique triplets.
                    while(low<high && nums[low]==nums[low-1]){
                        low++;
                    }
                }

                // if the sum is less than zero we will increment the low pointer.
                else if(sum<0){
                    low++;
                }
                else{
                    // if the sum is greater than zero we will decrement the high pointer.
                    high--;
                }
            }
        }

        // return the result list.
        return result;
    }


    public static void main(String[] args) {

        int[] arr = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(find_three_sum_brute(arr));

    }
}




