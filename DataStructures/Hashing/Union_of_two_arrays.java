package DataStructures.Hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Union_of_two_arrays {

    public static void find_union(int []arr_1,int []arr_2){
        Set<Integer> set = new HashSet<>();

        for (int x:arr_1) {
            set.add(x);
        }
        for (int x:arr_2) {
            set.add(x);
        }

        System.out.println(set);

    }


    public static void main(String[] args) {
        int[] arr_1 = {1, 1, 2, 3, 4, 5, 6};
        int[] arr_2 = {2, 3, 5, 7};
        find_union(arr_1,arr_2);

    }
}
