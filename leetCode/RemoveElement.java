package leetCode;

// leetCode #27

public class RemoveElement {

    public static int removeElement(int arr[], int target) {

        int size=arr.length;
        int l=0;
        int r=0;

        for (int i = 0; i < size; i++) {
            if (arr[r]==target)
            {
                r++;
            }
            else {
                arr[l]=arr[r];
                r++;
                l++;
            }
        }

        return l;

    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};

        System.out.println(removeElement(arr,3));

    }

}
