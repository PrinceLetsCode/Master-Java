package leetCode;

public class ThirdMax {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
        System.out.println(thirdMax(nums));
    }

    private static int thirdMax(int[] nums) {
        Integer max = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for (int num : nums) {
            if (num == max || num == secondMax || num == thirdMax) {
                continue;
            }
            if (max == null || num > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }
        }

        return thirdMax == null ? max : thirdMax;
    }
}
