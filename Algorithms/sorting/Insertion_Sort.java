package Algorithms.sorting;

public class Insertion_Sort {

    public static int[] insertion_sort(int[] arr) {
        int n=arr.length;

        //this loop is for traversing the array.
        for (int i = 1; i <n ; i++) {

            //storing the value of arr[i] in temp variable for comparing and swapping purpose without losing the value of arr[i].
            int temp = arr[i];

           /* this loop is for comparing the value of arr[i] with the previous elements of the array(last element of sorted sub-array)
            in order to sort the elements in sorted sub-array.*/
            int j=i-1;

           /*
           this loop will run backwards, which is from the last element of sorted sub-array to element which is less than temp.
           and then will place the value of temp at the position of j+1.(after the element which is smaller than temp).
           */
            while (j >= 0 && arr[j] > temp)
            {
                arr[j + 1] = arr[j];
                j--;
            }

         /*
          if there is the last element of sorted is less than temp then we will leave it at its
          position making it the last element of sorted sub-array.
         */
            arr[j + 1]=temp;
        }

        return arr;

    }

    public static void main(String[] args) {

        int arr[] = {5, 4, 10, 1, 6, 2};
        int []arr2=insertion_sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr2[i] + ", ");
        }

    }
}
