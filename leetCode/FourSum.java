package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.println(fourSum_optimal(nums, target));
    }

    // time complexity: O(n^4)
    private static List<List<Integer>> fourSum_brute(int[] nums, int target) {


        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                for (int k = j + 1; k < nums.length - 1; k++) {
                    for (int l = k + 1; l < nums.length; l++) {
                        if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            list.add(nums[l]);
                            if (!result.contains(list)) {
                                result.add(list);
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    // time complexity: O(n^3 log n +n log n)
    public static List<List<Integer>> fourSum_binarySearch(int[] nums, int target) {
        // create a list of list to store the result
        List<List<Integer>> result = new ArrayList<>();
        // sort the array so that we can use three pointer approach.
        Arrays.sort(nums);

        // we will use three pointer approach
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                for (int k = j + 1; k < nums.length - 1; k++) {
                    // fourth element will be the target - sum of first three elements
                    int sum = target - nums[i] - nums[j] - nums[k];
                    // we will use binary search to find the fourth element
                    int index = binarySearch(nums, k + 1, sum);
                    // if we find the element we will add it to the result
                    if (index != -1) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[index]);
                        // we will add the list to the result only if it is not already present
                        if (!result.contains(list)) {
                            result.add(list);
                        }
                    }
                }
            }
        }
        // return the result
        return result;
    }

    private static int binarySearch(int[] nums, int i, int sum) {
        int left = i;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == sum) {
                return mid;
            } else if (nums[mid] > sum) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static List<List<Integer>> fourSum_optimal(int[] nums, int target) {

        // create a list of list to store the result
        List<List<Integer>> result = new ArrayList<>();
        // sort the array so that we can use four pointer approach.
        Arrays.sort(nums);

        // we will use four pointer approach
        // we will i and j as the first two elements and k and l as the last two elements
        // setting i and j as the first two elements
        for (int i = 0; i < nums.length - 3; i++) {
            // if the current element is same as the previous element we will skip it
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 2; j++) {
                // if the current element is same as the previous element we will skip it
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                // left and right will be the last two elements
                int left = j + 1;
                int right = nums.length - 1;

                // we will use two pointer approach to find the last two elements
                while (left < right) {
                    // sum of the first two elements and last two elements
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) { // if the sum is equal to the target we will add it to the result
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        result.add(list);
                        // we will move the left and right pointer to the next element
                        left++;
                        right--;
                        // if the current left element is same as the previous element we will skip it
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                        // if the current right element is same as the next element we will skip it
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    } else if (sum > target) { // if the sum is greater than the target we will move the right pointer to the left
                        right--;
                    } else { // if the sum is less than the target we will move the left pointer to the right
                        left++;
                    }
                }
            }
        }
        // return the result
        return result;
    }


    public static List<List<Integer>> fourSum_optimal2(int[] nums, int target) {
        // if the length of the array is less than 4 we will return the empty list
        if (nums.length < 4) {
            return new ArrayList<>();
        }

        // create a list of list to store the result
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        // sort the array so that we can use four pointer approach.
        Arrays.sort(nums);

        // setting i and j as the first two elements
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                // target2 will be the target - sum of first two elements
                long target2 = (long) target - (long) nums[i] - (long) nums[j];
                // lo and hi will be the last two elements
                int lo = j + 1, hi = n - 1;

                // we will use two pointer approach to find the last two elements
                while (lo < hi) {
                    // sum of the last two elements
                    int twoSum = nums[lo] + nums[hi];

                    // if the sum is less than the target2 we will move the left pointer to the right
                    if (twoSum < target2) lo++;
                    // if the sum is greater than the target2 we wil move the right pointer to the left.
                    else if (twoSum > target2) hi--;
                    else {
                        // if the sum is equal to the target2 we will add it to the result
                        List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[lo], nums[hi]);
                        ans.add(quad);
                        // we will move the left and right pointer to the next element
                        // quad(2) and quad(3) because quad stores the lo at index 2 and hi at index 3
                        while (lo < hi && nums[lo] == quad.get(2)) lo++;
                        while (lo < hi && nums[hi] == quad.get(3)) hi--;
                    }
                }
                // we will move the j to the next element if the current element is same as the previous element
                while (j + 1 < n && nums[j] == nums[j + 1]) j++;
            }
            // we will move the i to the next element if the current element is same as the previous element
            while (i + 1 < n && nums[i] == nums[i + 1]) i++;
        }

        // return the result
        return ans;
    }

}
