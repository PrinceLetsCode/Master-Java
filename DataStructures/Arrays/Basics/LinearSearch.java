package DataStructures.Arrays.Basics;

public class LinearSearch {
    public static void main(String[] args) {
int[] arr = {1, 2, 3, 4,5, 6, 7};
        System.out.println(LinearSearch(arr, 4));
    }


    // time complexity : O(n)
    private static boolean LinearSearch(int[] arr, int target) {
        for(int i = 0; i< arr.length;i++){
            if (arr[i]==target){
                return true;
            }
        }

        return false;
    }
}
