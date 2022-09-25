package The450;

public class Count_inversion {

    public static void find_Count(int[] arr) {

        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        find_Count(arr);


    }
}
