package The450;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;

public class UnionAndIntersectionOfTwoSortedArrays {

    public static void find_union(int[] arr_a, int[] arr_b) {
        int length_a = arr_a.length;
        int length_b = arr_b.length;

        int i=0;
        int j=0;


        while (i < length_a && j < length_b) {
            if (arr_a[i] < arr_b[j]) {
                System.out.print(arr_a[i++] + " ");
            } else if (arr_b[j] < arr_a[i]) {
                System.out.print(arr_b[j++] + " ");
            } else {
                System.out.print(arr_b[j++]+" ");
                i++;
            }
        }

        while (i < length_a) {
            System.out.print(arr_a[i++] + " ");
        }
        while (j < length_b) {
            System.out.print(arr_b[j++] + " ");

        }


    }


    public static int[] find_intersection(int[] nums1, int[] nums2) {
        int length_a = nums1.length;
        int length_b = nums2.length;

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

    public static void main(String[] args) {

        int[] arr_a = {1,1,1,1,2,2,2,2};
        int[] arr_b = {1,1,1,1,2,2,2,2};

        find_union(arr_a, arr_b);
        System.out.println();
        find_intersection(arr_a, arr_b);
    }

}
