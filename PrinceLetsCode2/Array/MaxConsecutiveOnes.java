package PrinceLetsCode2.Array;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    private static int findMaxConsecutiveOnes(int[] arr) {
        int max = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }

        return Math.max(max, count);
    }
}
