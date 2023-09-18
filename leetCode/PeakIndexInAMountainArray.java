package leetCode;

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0};
        System.out.println(peakIndexInMountainArray_2(arr));
    }

    private static int peakIndexInMountainArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] < arr[mid + 1]) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        return i;
    }

    private static int peakIndexInMountainArray_2(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                return i;
            }
        }
        return -1;
    }
}
