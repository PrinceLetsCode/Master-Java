package The450;

public class Array012 {


    public static void sort_0_1_2(int[] arr) {
        int low=0;
        int mid=0;
        int high=arr.length-1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    swap(arr,low, mid);
                    low++;
                    mid++;
                    break;
                }

                case 1: {
                    mid++;
                    break;
                }

                case 2: {
                    swap(arr,mid, high);
                    high--;
                    break;
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");

        }

    }

    private static void swap(int []arr,int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;

    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort_0_1_2(arr);

    }

}
