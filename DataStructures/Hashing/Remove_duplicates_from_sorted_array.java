package DataStructures.Hashing;

import java.util.ArrayList;

public class Remove_duplicates_from_sorted_array {

    public static void remove_duplicates(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        int j=0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
//                arr[j] = arr[i];
                list.add(arr[i]);
                j++;
            }
        }

//        arr[j]=arr[arr.length-1];
        list.add(arr[arr.length-1]);




        System.out.println(list);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 6};
        remove_duplicates(arr);
    }

}
