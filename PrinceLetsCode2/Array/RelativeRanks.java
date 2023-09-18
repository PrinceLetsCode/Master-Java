package PrinceLetsCode2.Array;

import java.util.Arrays;

public class RelativeRanks {
    public static void main(String[] args) {
        int[] arr = {10,3,8,9,4};
        for(String s : findRelativeRanks(arr)) {
            System.out.print(s + " ");
        }
    }

    private static String[] findRelativeRanks(int[] arr) {
        int [] temp = new int[arr.length];
        String[] result = new String[arr.length];

        for(int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        Arrays.sort(temp);

        for(int i = 0; i < arr.length; i++) {
            int j = 0;
            while(j < temp.length) {
                if(arr[i] == temp[j]) {
                    break;
                }
                j++;
            }

            if(j == temp.length - 1) {
                result[i] = "Gold Medal";
            } else if(j == temp.length - 2) {
                result[i] = "Silver Medal";
            } else if(j == temp.length - 3) {
                result[i] = "Bronze Medal";
            } else {
                result[i] = String.valueOf(temp.length - j);
            }
        }

        return result;
    }
}
