package PrinceLetsCode2.Array;

public class TwoSumIIArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] result = twoSum(arr, 9);

        for(int i : result) {
            System.out.print(i + " ");
        }
    }

    private static int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i = 0;
        int j = n-1;

        while(i < j){
            if(numbers[i] + numbers[j] == target){
                return new int[]{i+1, j+1};
            }
            else if(numbers[i] + numbers[j] > target){
                j--;
            }
            else{
                i++;
            }


        }

        return new int[]{-1, -1};
    }
}
