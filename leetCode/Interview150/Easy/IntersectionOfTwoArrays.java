package leetCode.Interview150.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] res = intersection(nums1, nums2);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i] + " ");
        }
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    res[k] = nums1[i];
                    k++;
                }
            }
        }
        return res;
    }

    // optimized solution
    private static int[] intersection2(int[] nums1, int[] nums2) { int length_a = nums1.length;
        int length_b = nums2.length;


        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> result = new ArrayList<>();

        int i=0;
        int j=0;

        while (i < length_a && j < length_b) {
            if (nums1[i] < nums2[j])
                i++;
            else if (nums2[j] < nums1[i])
                j++;
            else {
                result.add(nums2[j++]);
                i++;
            }
        }

        int[] output = new int[result.size()];
        int k = 0;
        while(k < result.size()){
            output[k] = result.get(k);
            k++;
        }
        return output;

    }
}
