package PrinceLetsCode2.Array;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4};

        System.out.println(findMedianSortedArrays(arr1, arr2));
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;

        int[] merged = new int[size1 + size2];

        int iter1 = 0;
        int iter2 = 0;

        int resIter = 0;

        while (iter1 < size1 && iter2 < size2) {
            if (nums1[iter1] <= nums2[iter2]) {
                merged[resIter] = nums1[iter1];
                iter1++;
                resIter++;
            } else if (nums1[iter1] > nums2[iter2]) {
                merged[resIter] = nums2[iter2];
                iter2++;
                resIter++;
            }
        }

        while (iter1 < size1) {
            merged[resIter] = nums1[iter1];
            iter1++;
            resIter++;
        }


        while (iter2 < size2) {
            merged[resIter] = nums2[iter2];
            iter2++;
            resIter++;
        }

        double median = 0;

        if (merged.length % 2 == 0) {
            int mid1 = merged[merged.length / 2];
            int mid2 = merged[(merged.length / 2) - 1];
            median = (double) (mid1 + mid2) / 2;
        } else {
            median = (double) merged[merged.length / 2];
        }

        return median;
    }

    // optimized solution
    // time complexity: O(m+n)
    // space complexity: O(1)

    private static int findMedianSortedArrays_optimized(int[] nums1, int[] nums2){
        int size1  = nums1.length;
        int size2 = nums2.length;

        int iter1 = 0;
        int iter2 = 0;

        int median1 = -1;
        int median2 = -1;

        for(int i = 0; i <= (size1+size2)/2; i++){
            median1 = median2;

            if(iter1 == size1){
                median2 = nums2[iter2];
                iter2++;
            }else if(iter2 == size2){
                median2 = nums1[iter1];
                iter1++;
            }else if(nums1[iter1] <= nums2[iter2]){
                median2 = nums1[iter1];
                iter1++;
            }else{
                median2 = nums2[iter2];
                iter2++;
            }
        }

        if((size1+size2)%2 == 0){
            return (median1+median2)/2;
        }

        return median2;
    }


    // optimized solution
    // time complexity: O(log(min(m,n)))
    // space complexity: O(1)

    private static double findMedianSortedArrays_optimized2(int[] nums1, int[] nums2){
       int size1= nums1.length;
       int size2 = nums2.length;

       if(size1 > size2){
           return findMedianSortedArrays_optimized2(nums2, nums1);
       }

       int low = 0;
       int high = size1;

       while(low <= high){
           int PartitionX = (low+high)/2;
           int PartitionY = (size1+size2+1)/2 - PartitionX;

           int minLeftX = (PartitionX == 0) ? Integer.MIN_VALUE : nums1[PartitionX-1];
           int maxRightX = (PartitionX == size1) ? Integer.MAX_VALUE : nums1[PartitionX];

              int minLeftY = (PartitionY == 0) ? Integer.MIN_VALUE : nums2[PartitionY-1];
              int maxRightY = (PartitionY == size2) ? Integer.MAX_VALUE : nums2[PartitionY];

                if(minLeftX <= maxRightY && minLeftY <= maxRightX){
                    if((size1+size2)%2 == 0){
                        return (Math.max(minLeftX, minLeftY) + Math.min(maxRightX, maxRightY))/2;
                    }else{
                        return Math.max(minLeftX, minLeftY);
                    }

                }else if(minLeftX > maxRightY){
                    high = PartitionX-1;
                }
                else{
                    low = PartitionX+1;
                }

       }

       return -1;
    }
}
