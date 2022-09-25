package DataStructures.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Two_arrays_In_Sorted_order {


    public static void sort_in_sorted(int []arr_1,int []arr_2){

        Arrays.sort(arr_1);
        Arrays.sort(arr_2);
        ArrayList<Integer> list = new ArrayList<>();

        int i=0,j=0;
        while(i<arr_1.length && j<arr_2.length){
            if(arr_1[i]<arr_2[j]){
                list.add(arr_1[i]);
                i++;
            }else if (arr_1[i]>arr_2[j]){
                list.add(arr_2[j]);
                j++;
            }else {
                list.add(arr_1[i]);
                list.add(arr_2[j]);
                i++;
                j++;
            }
        }
        while (i<arr_1.length){
            list.add(arr_1[i]);
            i++;
        }
        while (j<arr_2.length){
            list.add(arr_2[j]);
            j++;
        }

//        for (int k : list) {
//            System.out.println(list.get(k));
//        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        int[] arr_1 = {5, 8, 5, 7, 8, 10};
        int[] arr_2 = {1, 5, 5, 8, 1, 8, 7};

        sort_in_sorted(arr_1,arr_2);

    }

}
