package leetCode.Interview150.Easy;

public class MergeSortedArray {


    static void mergeArrays(int[] nums1, int m, int[] nums2, int n) {

        int p1=m-1;
        int p2=n-1;
        int i=(m+n)-1;
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i] = nums1[p1];
                i--;
                p1--;
            }
            else
            {
                nums1[i] = nums2[p2];
                i--;
                p2--;
            }
        }


        for (int j = 0; j < m+n; j++) {
            System.out.println(nums1[j]+" ");
        }

    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        mergeArrays(nums1, 3, nums2, 3);

    }
}
