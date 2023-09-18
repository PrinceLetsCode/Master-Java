package The450;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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


    /*

    Here's a dry run of the code with a sample input array intervals = [[1,3],[2,6],[8,10],[15,18]]:
    First, the input array intervals is sorted based on the first element of each sub-array. The sorted array is:

    intervals = [[1,3],[2,6],[8,10],[15,18]]
    Initialize a linked list merged to store the merged intervals.

    iteration	interval	merged
            1	[1,3]	    [[1,3]]
            2	[2,6]	    [[1,6]]
            3	[8,10]	    [[1,6],[8,10]]
            4	[15,18]	    [[1,6],[8,10],[15,18]]

    For each interval interval in the sorted array intervals, the following steps are performed:

    a. If merged is empty or the last sub-array in merged has its end value less than the start value of interval,
       add interval to merged.
    b. Otherwise, merge the current interval interval with the last sub-array in merged by updating the end value
       of the last sub-array in merged to be the maximum of its current end value and the end value of interval.

    Finally, the linked list merged is converted to an array result of size merged.size() and returned.
    The resulting merged intervals are:

    result = [[1,6],[8,10],[15,18]]
    */



    public static void main(String[] args) {
        int arr[][] = {{1,3}, {2, 6}, {8, 10}, {15, 18}};
//        int [][]result=merge_intervals(arr);
        int [][]result=merge(arr);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print("["+result[i][j]+"]");
            }
            System.out.println();
        }
    }

    // brute force solution
    public static int[][] merge(int[][] intervals) {

        List<int[]> result = new ArrayList<>();

        for(int i=0; i<intervals.length; i++) {
            int[] interval = intervals[i];
            int start = interval[0];
            int end = interval[1];

            for(int j=i+1; j<intervals.length; j++) {
                int[] nextInterval = intervals[j];
                int nextStart = nextInterval[0];
                int nextEnd = nextInterval[1];

                if(nextStart <= end) {
                    start = Math.min(start, nextStart);
                    end = Math.max(end, nextEnd);
                    i++;
                }
            }

            result.add(new int[]{start, end});
        }

        return result.toArray(new int[result.size()][]);

    }

}
