package leetCode;

public class SignOfProductOFAnArray {
    public static void main(String[] args) {
        int[] nums = {9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
        System.out.println(arraySign(nums));
    }

    public static int arraySign(int[] nums) {
        int minCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0) return 0;
            if(nums[i]<0) minCount++;
        }

        return minCount%2==0?1:-1;

    }
}
