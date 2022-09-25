package The450;

public class FIndDuplicateNumber {

    public static int find_duplicate(int[] nums) {


        int slow = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        while(slow != fast);

        fast = nums[0];

        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 4, };
        System.out.println(find_duplicate(arr));
    }

}
