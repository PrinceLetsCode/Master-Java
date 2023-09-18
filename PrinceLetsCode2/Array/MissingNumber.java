package PrinceLetsCode2.Array;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }

    private static int missingNumber(int[] arr) {
        int n = arr.length;

        int rangeSum = n*(n+1)/2;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }

        return rangeSum - sum;
    }
}
