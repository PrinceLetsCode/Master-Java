package The450;

public class MaxAndMin {

    public static void find_max_min(int[] arr) {
        int MAX = arr[0];
        int MIN = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > MAX)
                MAX = arr[i];

            if (arr[i] < MIN)
                MIN = arr[i];
        }

        System.out.println(MIN + " and " + MAX);

    }

    public static void main(String[] args) {
        int arr[] = {0, 2, 3, 4, 56};
        find_max_min(arr);

    }
}
