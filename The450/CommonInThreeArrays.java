package The450;

public class CommonInThreeArrays {

    public static void find_common(int[] arr_1, int[] arr_2, int[] arr_3) {
        int i = 0;
        int j = 0;
        int k = 0;

        int n1 = arr_1.length;
        int n2 = arr_2.length;
        int n3 = arr_1.length;

        int prev_1;
        int prev_2;
        int prev_3;

        prev_1 = prev_2 = prev_3 = Integer.MIN_VALUE;


        while (i < n1 && j < n2 && k < n3) {

            while (i < n1 && prev_1 == arr_1[i]) {
                i++;
            }


            while (j < n2 && prev_2 == arr_2[j]) {
                j++;
            }

            while (k < n3 && prev_3 == arr_3[k]) {
                k++;
            }

            if (i < n1 && j < n2 && k < n3) {

                if (arr_1[i] == arr_2[j] && arr_2[j] == arr_3[k]) {
                    System.out.println(arr_1[i]);
                    i++;
                    j++;
                    k++;
                } else if (arr_1[i] < arr_2[j]) {
                    prev_1 = arr_1[i];
                    i++;
                } else if (arr_2[j] < arr_3[k]) {
                    prev_2 = arr_2[j];
                    j++;
                } else {
                    prev_3 = arr_3[k];
                    k++;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr_1 = {1, 5, 10, 20, 40, 80, 80};
        int[] arr_2 = {6, 7, 20, 80, 80, 100};
        int[] arr_3 = {3, 4, 15, 20, 30, 70, 80, 80, 120};

        find_common(arr_1, arr_2, arr_3);
    }
}
