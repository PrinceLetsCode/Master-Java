package Recursion;

public class ArrayPalindrome {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1};
        System.out.println(isPalindrome(arr, 0, arr.length-1));
    }

    private static boolean isPalindrome(int[] arr, int start, int end) {
        if (start >= end) return true;
        if (arr[start] == arr[end]) {
            return isPalindrome(arr, start+1, end-1);
        }else {
            return false;
        }
    }
}
