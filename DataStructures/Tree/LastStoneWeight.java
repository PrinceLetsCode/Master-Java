package DataStructures.Tree;

import java.util.Arrays;

public class LastStoneWeight {
    public static void main(String[] args) {
        int[] arr = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(arr));
    }

    private static int lastStoneWeight(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        while (n > 1){
            int x = arr[n-1];
            int y = arr[n-2];
            if(x == y){
                n = n-2;
            }else{
                arr[n-2] = x-y;
                n--;
            }
            Arrays.sort(arr);
        }

        return n == 0 ? 0 : arr[0];
    }
}
