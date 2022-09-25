package DataStructures.Hashing;

import java.util.HashSet;
import java.util.Set;

public class Two_pairs_sum {

    public static void find_pairs(int[] arr,int sum) {

        Set<Integer> set = new HashSet<>();
//        for (int x : arr) {
//            set.add(x);
//        }

        for (int x : arr) {
            if (set.contains(sum - x))
                System.out.println(x + " " + (sum - x));

                set.add(x);
        }

        System.out.println(set);
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 15, 2, 9, 4, 3, 12};
        find_pairs(arr, 13);
    }
}
