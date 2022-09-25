package DataStructures.Hashing;

import java.util.HashSet;
import java.util.Set;

public class Intersection_two_arrays {


    /*
    * 1.first we will check for the last occurrence of the element in the array.
    * 2.code explanation for the last occurrence of the element in the array.
    *  a.first we will initialise a boolean flag with false.
    *   b.now we will traverse array for the first element to its next occurrence and will turn the flag to true and will
    *    break the second loop
    *    c.now we will check for the flag if it is true then we will continue the iteration of first loop so that we can
    *      check for the last occurrence of next element.
    *     d.if the flag is false then it means the current element is the last occurrence of the element in the array.
    *       e.now we will compare the current element with the element in the second array and if we find the element in the
    *        second array then we will print the element as they are common and will break the loop so that other similar
    *        elements in array2 are not printed.
    *       f.if the element is not found in the second array then we will continue the iteration of first loop so that we can
    *       check for the last occurrence of next element and so on until we traverse the whole array and find all the common
    *       elements.
    *
    *   time complexity:O(n^2)
    * */


    public static void find_intersection_naive_app(int[] arr, int[] arr_2) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }

            if (flag == true) {
                continue;
            }/*else {
                System.out.println("last occurance of" + arr[i] + " is " + i);
            }*/

            for (int k = 0; k < arr_2.length; k++) {
                if (arr[i] == arr_2[k]) {
                    System.out.println(arr[i]);
                    break;
                }
            }


        }
    }


    /*
     * 1. Create a hash set for the first array.
     * 2.create a hash set for the second array.
     * 3.it will remove the duplicate elements. from both the arrays.
     * 4.Iterate through second set and check if the element is present in the first set.
     * 5.If present print the element.
     * time complexity: O(n)
     */


    public static void find_intersection_hashSet_approach_1(int[] arr_1, int[] arr_2) {
        Set<Integer> set_1 = new HashSet<>();
        Set<Integer> set_2 = new HashSet<>();


        for (int i = 0; i < arr_1.length; i++) {
            set_1.add(arr_1[i]);
        }


        for (int i = 0; i < arr_2.length; i++) {
            set_2.add(arr_2[i]);
        }

        for (int x : set_2) {
            if (set_1.contains(x)) {
                System.out.println(x);
            }
        }

        System.out.println(set_1);
        System.out.println(set_2);

    }

    /*
     *
     * 1. Create a hash table for arr_1[].
     * 2. Insert all elements of arr_1[] to hash.
     * 3.it removes duplicates from arr_1[].
     * 4. now compare each element of arr_2[] with elements of hash.
     * 5. if element is present in hash then print it.
     * 6. remove element from hash to handle duplicates and so that it does not print it again.
     * 7. Time complexity: O(m+n)
     *
     * */


    public static void find_intersection_hashSet_approach_2(int[] arr_1, int[] arr_2) {
        Set<Integer> set = new HashSet<>();


        for (int i = 0; i < arr_1.length; i++) {
            set.add(arr_1[i]);
        }

        for (int i = 0; i < arr_2.length; i++) {
            if (set.contains(arr_2[i])) {
                System.out.println(arr_2[i]);
                set.remove(arr_2[i]);
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr_2 = {2, 3, 4, 5, 6, 7, 7, 8};

//        find_intersection_naive_app(arr, arr_2);
        find_intersection_hashSet_approach_2(arr, arr_2);
    }

}
