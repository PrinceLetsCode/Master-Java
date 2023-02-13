package leetCode.Interview150.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums)); // 2
    }

    private static int missingNumber(int[] nums) {
        Arrays.sort(nums);

        if (nums[0] != 0) {
            return 0;
        }
        int i=0;
        while (i < nums.length - 1) {
            if (nums[i] + 1 != nums[i + 1]) {
                return nums[i] + 1;
            }
            i++;
        }

        return nums[nums.length - 1] + 1;
    }

    // using map
    public static int missingNumber2(int[] nums) {
        int[] map = new int[nums.length + 1];
        for (int num : nums) {
            map[num] = 1;
        }
        for (int i = 0; i < map.length; i++) {
            if (map[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    // using hashset

    public static int missingNumber3(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    // using sum
    public static int missingNumber4(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (nums.length * (nums.length + 1)) / 2 - sum;
    }
}
