package PrinceLetsCode2.revision;

import java.util.ArrayList;
import java.util.List;

public class SummaryRangesRevision {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        System.out.println(summaryRanges(nums));

    }

    private static List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();

        int start = nums[0];

        int n = nums.length;

        for(int i = 0; i < n; i++){
            if( i == n-1 || nums[i+1] != nums[i]+1){

                if(start == nums[i]){
                    ranges.add(start+"");
                }else{
                    ranges.add(start+"->"+nums[i]);
                }


                if( i != n-1){
                    start = nums[i+1];
                }

            }
        }

        return ranges;
    }
}
