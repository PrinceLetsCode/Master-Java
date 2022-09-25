package DataStructures.Hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDistinctElements {

    public static void find_distinct_approach_1(int[] arr) {

        /*
        * In this approach we don't count the first occurrence of an  element .we count the last occurrence of the element.
        * we do this by using two for loops.
        * we break the second loop once we find the duplicate element and set the flag to true.
        * now we get back to outer loop and set the flag to false;
        * if no duplicate element is found, we exit from the second loop and if flag is false we increase the count for
        * distinct numbers. and so on
        * time complexity O(n^2)
        * space complexity O(1)
        * */




        int count=0;

        boolean flag=false;

        for (int i = 0; i < arr.length; i++) {
            flag=false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flag=true;
                    break;
                }
            }

            if (!flag) {
                count++;
            }
        }
        System.out.println(count);

    }

    public static void find_distinct_approach_2(int[] arr) {
        Arrays.sort(arr);
        int count=0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                count++;
            }
        }
        count++;
        System.out.println(count);
    }


    public static void find_distinct_approach_3(int[] arr) {
        Set<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }

        System.out.println(hashSet.size());
        
    }


    public static void main(String[] args) {
        int[] arr = {5, 8,8, 5,5,6, 7, 8};
        find_distinct_approach_3(arr);

    }
}
