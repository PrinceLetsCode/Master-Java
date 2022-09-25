package The450;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {


    public static int[][] merge_intervals(int[][] intervals) {


        //first we sort the array so that we can compare the last of first index and first of first index+1
        //we have 2d array to sort so (a, b) -> Integer.compare(a[0], b[0]) sorts the array by comparing the first element
        //of the sub arrays.
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));


        //we made a LinkedList of arrays as we will need to compare the last sub array to the next one.
        LinkedList<int[]> merged=new LinkedList<>();


        for(int[] interval:intervals)
        {

            //now if the merged list is empty we add one so that we can compare the upcoming sub-arrays with something.
            //if the first element of the next sub array is not smaller than the first element of first sub array means
            //it can not be merged in the current sub array so we add it to the list otherwise we execute the else statement
            //and merge two intervals.
            if(merged.isEmpty() || merged.getLast()[1]<interval[0] )
            {
                merged.add(interval);
            }else
            {
                merged.getLast()[1]=Math.max(merged.getLast()[1],interval[1]);
            }
        }


        //we need to return an array so we convert the list into an array of size of LinkedList.
        return merged.toArray(new int[merged.size()][]);
    }


    public static void main(String[] args) {
        int arr[][] = {{1,3}, {2, 6}, {8, 10}, {15, 18}};
        int [][]result=merge_intervals(arr);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print("["+result[i][j]+"]");
            }
            System.out.println();
        }
    }

}
