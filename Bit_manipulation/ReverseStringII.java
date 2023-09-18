package Bit_manipulation;

public class ReverseStringII {
    public static void main(String[] args) {
        String s = "leetcodeforyou";
        int k = 2;
        System.out.println(reverseString(s, k));
    }

    private static String reverseString(String s, int k) {
        char[] arr = s.toCharArray();

        int i = 0;
        while (i < arr.length) {
            int j = Math.min(i + k - 1, arr.length - 1);
            swap(arr, i, j);
            i += 2 * k;
        }

        return String.valueOf(arr);
    }

    private static void swap(char[] arr, int i, int j) {
        while (i < j) {
            char temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }
}
