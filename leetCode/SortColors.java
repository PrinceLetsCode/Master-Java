package leetCode;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void sortColors(int[] nums) {

        int p1 = 0, p2 = nums.length - 1, index = 0;
        while (index <= p2) {
            if (nums[index] == 0) {
                nums[index] = nums[p1];
                nums[p1] = 0;
                p1++;
            }
            if (nums[index] == 2) {
                nums[index] = nums[p2];
                nums[p2] = 2;
                p2--;
                index--;
            }
            index++;
        }
    }




    /*

    Algorithm:
    Initialize two pointers p1 and p2 to keep track of the positions of 0's and 2's respectively.
    Set p1 = 0 and p2 = nums.length - 1.

    Initialize a pointer index to traverse the array. Set index = 0.

    Repeat the following steps until index is less than or equal to p2:

    a. If nums[index] is equal to 0, swap nums[index] with nums[p1] and increment p1 by 1.
    b. If nums[index] is equal to 2, swap nums[index] with nums[p2] and decrement p2 by 1.
       Decrement index by 1 to revisit the new value at nums[index].
    c. Increment index by 1.

    The array nums is now sorted, with 0's in the beginning, followed by 1's, and then 2's.

    iteration	p1	p2	index	    nums[]
            1	0	5	0	    [2, 0, 2, 1, 1, 0]
            2	1	5	1	    [0, 0, 2, 1, 1, 2]
            3	1	4	2	    [0, 0, 2, 1, 1, 2]
            4	1	4	3	    [0, 0, 1, 1, 2, 2]
            5	1	3	4	    [0, 0, 1, 1, 2, 2]
            6	2	3	5	    [0, 0, 1, 1, 2, 2]

    */


    private static void sortColors_2(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count0++;
            }
            if (nums[i] == 1) {
                count1++;
            }
            if (nums[i] == 2) {
                count2++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < count0) {
                nums[i] = 0;
            } else if (i < count0 + count1) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }

}
