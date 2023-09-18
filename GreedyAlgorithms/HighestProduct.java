package GreedyAlgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class HighestProduct {
    public static void main(String[] args) {
        List<Integer> A = List.of(0, -1, 3, 100, 70, 50);
        System.out.println(maxp3(A));
        
    }

    private static int maxp3(List<Integer> a) {
        // sort the array
        int[] arr = new int[a.size()];


        for (int i = 0; i < a.size(); i++) {
            arr[i] = a.get(i);
        }
        Arrays.sort(arr);
        int high3 = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3];
        int high2 = arr[0] * arr[1] * arr[arr.length - 1];
        return Math.max(high2, high3);

    }
}
