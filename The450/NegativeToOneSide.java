package The450;

public class NegativeToOneSide {

    public static void Neg_to_one_side(int[] arr) {

            int neg=0;
            int pos=0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[neg] > 0 || arr[neg] == arr[pos]) {
                    neg++;
                } else {
                    swap(arr, neg, pos);
                    neg++;
                    pos++;
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
        int[] arr = {3, -5, 6, -2, 3, -1};
        Neg_to_one_side(arr);

    }
}
