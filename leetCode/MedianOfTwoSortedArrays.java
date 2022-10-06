package leetCode;

public class MedianOfTwoSortedArrays {

    // Time complexity: O(m+n)
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {


        // store the length of the two arrays
        int m = nums1.length;
        int n = nums2.length;

        // create a new array to store the merged array
        int[] result = new int[m + n];

        // create three pointers to traverse the three arrays
        int i,j,k;
        i=j=k=0;

        // traverse the two arrays and store the elements in the result array
        while (i < m && j < n) {  // traverse the two arrays
            if (nums1[i] <nums2[j]) { // if the element in nums1 is less than the element in nums2
                result[k] = nums1[i]; // store the element in nums1 in the result array
                i++; // increment the pointer of nums1

            } else if (nums1[i] > nums2[j]) {  // if the element in nums1 is greater than the element in nums2
                result[k] = nums2[j];   // store the element in nums2 in the result array
                j++;  // increment the pointer of nums2
            }else {
                result[k] = nums1[i];  // if the elements are equal store the element in nums1 in the result array
                i++;    // increment the pointer of nums1
            }
            k++; // increment the pointer of the result array
        }


        // if there are elements left in nums1
        while (i < m) { // traverse the nums1 array
            result[k] = nums1[i];   // store the elements in the result array
            i++;    // increment the pointer of nums1
            k++;    // increment the pointer of the result array
        }

        // if there are elements left in nums2
        while (j < n) { // traverse the nums2 array
            result[k] = nums2[j];  // store the elements in the result array
            j++;   // increment the pointer of nums2
            k++;  // increment the pointer of the result array
        }

        // if the length of the result array is odd return the middle element of the result array as the median of the two sorted arrays
        // else return the average of the middle two elements of the result array as the median of the two sorted arrays
        return result.length % 2 == 0 ? (result[result.length / 2] + result[(result.length / 2) - 1]) / 2.0 : result[result.length / 2];
    }



    // Time complexity: O(log(min(m,n)))
    public static double median_using_binary_search(int[] nums1, int[] nums2) {

        // We will always search in the smaller array.
        if (nums1.length > nums2.length) {
            return median_using_binary_search(nums2, nums1);
        }

        // store the length of the smaller array.
        int x = nums1.length;

        // store the length of the larger array.
        int y = nums2.length;


        // low and high will be the starting and ending index of the smaller array.
        int low = 0;
        int high = x;


        // partitionX and partitionY will be the partition index of the smaller and larger array respectively.
        while (low <= high) {


            int partitionX = (low + high) / 2;  // partition index of the smaller array.
            int partitionY = (x + y + 1) / 2 - partitionX; // partition index of the larger array.

            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1]; // max element on the left side of the partition in the smaller array.
            int minRightX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX]; // min element on the right side of the partition in the smaller array.

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1]; // max element on the left side of the partition in the larger array.
            int minRightY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY]; // min element on the right side of the partition in the larger array.

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {  // if the partition is correct.
                if ((x + y) % 2 == 0) {  // if the total number of elements is even.
                    return ((double) Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2; // return the average of the max of the left side and the min of the right side.
                } else {
                    return (double) Math.max(maxLeftX, maxLeftY); // return the max of the left side.
                }
            } else if (maxLeftX > minRightY) {  // if the partition is not correct.
                high = partitionX - 1; // move the partition to the left.
            } else {
                low = partitionX + 1;  // move the partition to the right.
            }
        }

        // if we reach here, it means that the arrays are not sorted or the arrays are empty.
       return 0;
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 6, 7};
        int[] nums2 = {3, 4};

//        System.out.println(findMedianSortedArrays(nums1, nums2));
        System.out.println(median_using_binary_search(nums1, nums2));

    }
}
