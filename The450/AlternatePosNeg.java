package The450;

public class AlternatePosNeg {

    public static void Modify_array(int arr[]) {
        int left = 0;
        int right = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[right] < 0) {
                swap(arr,right, left);
                left = left + 2;
                right++;
            }
            else right++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swap(int []arr,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 3, -4, -1, 4};

        Modify_array(arr);
    }
}
