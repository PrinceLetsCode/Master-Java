package leetCode;

public class RemoveDuplicatesFromArray {

    public static int[] removeDuplicates(int []arr)
    {
        int size=arr.length;
        int left=1;
        int right=1;

        for (int i = 1; i < size; i++) {
            if (arr[right]==arr[right-1])
            {
                right++;
            }
            else {
                arr[left]=arr[right];
                right++;
                left++;
            }
        }
        System.out.println(left);
        return arr;
    }


    public static void main(String[] args) {
        int []arr={0,0,1,1,1,2,2,3,3,4};

        int []resultArr=removeDuplicates(arr);
        for (int i = 0; i < resultArr.length; i++) {
            System.out.print(resultArr[i]+" ,");
        }
    }

}
