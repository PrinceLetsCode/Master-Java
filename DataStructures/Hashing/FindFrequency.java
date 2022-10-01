package DataStructures.Hashing;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindFrequency {

    public static void find_frequency_app_1(int[] arr) {
            boolean flag=false;
            int count=0;
        for (int i = 0; i < arr.length; i++) {
                flag=false;
                count=0;

            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] == arr[j]) {
                    flag=true;
                    break;
                }
                
            }

            if (flag)
                continue;

            for (int j = 0; j <=i; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i]+" : "+count);
        }

    }


    public static void find_frequency_app_2(int[] arr) {

        Arrays.sort(arr);

        int i=0;
        int count=0;

        while (i < arr.length) {
            count=1;

            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                i++;
                count++;
            }

            System.out.println(arr[i] + " : " + count);
            i++;
        }
    }


    public static void find_freq_app_3(int[] arr) {

        Map < Integer, Integer > map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else
                map.put(arr[i], 1);
        }

/*        for (Map.Entry < Integer, Integer > itr: map.entrySet())
            System.out.println(itr.getKey() + " " + itr.getValue());
            ->this code does not print it in the ordered way.
            */

        System.out.println(map);


        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) != -1) {
                System.out.println(arr[i] + " : " + map.get(arr[i]));
                map.put(arr[i], -1);
            }
        }

        System.out.println(map);

    }







    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 2, 3, 4, 5, 5, 4, 4};
        find_freq_app_3(arr);

    }
}
