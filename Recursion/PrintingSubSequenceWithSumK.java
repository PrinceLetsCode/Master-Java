package Recursion;

import java.util.ArrayList;

public class PrintingSubSequenceWithSumK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 10;
        ArrayList<Integer> list = new ArrayList<>();
        printSubSequenceWithSumK(arr, 0, list, k, 0);
//        printOneSubsequenceWithSumK(arr, 0, list, k, 0);
        System.out.println(printNumberOfSubsequenceWithSumK(arr, 0, k, 0));
    }


    private static void printSubSequenceWithSumK(int[] arr, int index, ArrayList<Integer> list, int k, int sum) {
        if (index >= arr.length) {
            if (sum == k) {
                System.out.println(list);
            }
            return;
        }
        list.add(arr[index]);
        sum += arr[index];
        printSubSequenceWithSumK(arr, index + 1, list, k, sum);
        sum -= arr[index];
        list.remove(list.size() - 1);
        printSubSequenceWithSumK(arr, index + 1, list, k, sum);

    }


    private static boolean printOneSubsequenceWithSumK(int[] arr, int index, ArrayList<Integer> list, int k, int sum) {
        if (index >= arr.length) {
            if (sum == k) {
                System.out.println(list);
                return true;
            }
            return false;
        }
        list.add(arr[index]);
        sum += arr[index];
        if (printOneSubsequenceWithSumK(arr, index + 1, list, k, sum) == true) {
            return true;
        }
        sum -= arr[index];
        list.remove(list.size() - 1);

        if (printOneSubsequenceWithSumK(arr, index + 1, list, k, sum) == true) {
            return true;
        }

        return false;
    }



    private static int printNumberOfSubsequenceWithSumK(int[] arr, int index, int k, int sum) {
        if (index >= arr.length) {
            if (sum == k) {
                return 1;
            }
            return 0;
        }
        sum += arr[index];
        int l = printNumberOfSubsequenceWithSumK(arr, index + 1, k, sum);
        sum -= arr[index];

        int r = printNumberOfSubsequenceWithSumK(arr, index + 1, k, sum);

        return l + r;
    }
}
