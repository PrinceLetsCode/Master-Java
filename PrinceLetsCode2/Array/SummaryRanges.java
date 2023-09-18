package PrinceLetsCode2.Array;

import java.util.ArrayList;
import java.util.List;
public class SummaryRanges {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,7};
        System.out.println(summaryRanges(arr));
    }

    private static List<String> summaryRanges(int[] arr) {
        List<String> result = new ArrayList<>();

        int n = arr.length;

       if (n == 0) {
           return result;
       }

           int start = arr[0];

           for (int i = 0; i < n; i++) {
               if (i == n - 1 || arr[i] + 1 != arr[i + 1]) {
                   if (arr[i] == start) {
                       result.add(start + "");
                   } else {
                       result.add(start + "->" + arr[i]);
                   }

                   if (i != n - 1) {
                       start = arr[i + 1];
                   }
               }


           }
           return result;


       }}
