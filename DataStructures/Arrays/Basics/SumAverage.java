package DataStructures.Arrays.Basics;

public class SumAverage {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        System.out.println(sum(arr));
        System.out.println(average(arr));
    }

    private static double average(int[] arr) {

        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum +=  arr[i];
        }

        return sum/arr.length;
    }

    private static double sum(int[] arr) {
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum +=  arr[i];
        }

        return sum;
    }
}
