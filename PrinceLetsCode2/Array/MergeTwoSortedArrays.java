package PrinceLetsCode2.Array;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2};

        int[] result = merge(arr1, arr2);

        for(int i : result){
            System.out.print(i + " ");
        }
    }

    private static int[] merge(int[] nums1, int[] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;

        int[] merged = new int[size1+size2];

        int iter1 = 0;
        int iter2 = 0;

        int resIter = 0;

        while( iter1 < size1 && iter2 < size2){
            if(nums1[iter1] <= nums2[iter2]){
                merged[resIter] = nums1[iter1];
                iter1++;
                resIter++;
            }else if( nums1[iter1] > nums2[iter2]){
                merged[resIter] = nums2[iter2];
                iter2++;
                resIter++;
            }
        }

        while(iter1 < size1){
            merged[resIter] = nums1[iter1];
            iter1++;
            resIter++;
        }


        while(iter2 < size2){
            merged[resIter] = nums2[iter2];
            iter2++;
            resIter++;
        }

        return merged;
    }
}
