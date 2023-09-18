package PrinceLetsCode2.Array;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void moveZeroes(int[] arr) {
        int i  = 0;
        int j = 0;
        while (j < arr.length) {
            if(arr[j]==0){
                j++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
    }
}
