package Recursion;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        reverseArray_Recursive_Parameterized(arr,0,arr.length-1);
//        reverseArray_Recursive_Functional(arr, 0);
        reverseArray_Iterative_2(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private static void reverseArray_Iterative(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static void reverseArray_Iterative_2(int[] arr) {
        int start = 0;
        while(start<arr.length/2){
            int temp = arr[start];
            arr[start] = arr[arr.length-start-1];
            arr[arr.length-start-1] = temp;
            start++;
        }
    }


    private static void reverseArray_Recursive_Parameterized(int[] arr, int i, int j) {
         if (i >= j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;

        reverseArray_Recursive_Parameterized(arr, i + 1, j - 1);
    }

    private static void reverseArray_Recursive_Functional(int[] arr, int i) {
        if (i > arr.length / 2) {
            return ;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;

        reverseArray_Recursive_Functional(arr, i + 1);
    }


}
