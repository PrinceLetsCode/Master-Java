package The450;

public class ReverseTheArray {

    public static void reverse_array(int[] arr) {

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse_array(arr);


    }
}
