package PrinceLetsCode2.Array;

import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappeared {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

        for(int i : findDisappearedNumbers(arr)) {
            System.out.print(i + " ");
        }
    }

    private static List<Integer> findDisappearedNumbers(int[] arr) {
        Set<Integer> set = new java.util.HashSet<>();
        List<Integer> result = new java.util.ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }


        for(int i = 1; i <= arr.length; i++) {
            if(!set.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}
