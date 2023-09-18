package DataStructures.Tree;

public class UncrossedLines {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,1,2};
        int[] arr2 = {1,3,2,3,1};
        System.out.println(maxUncrossedLines(arr1,arr2));
    }

    private static int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int count = 0;
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = index; j < n; j++) {
                if(nums1[i] == nums2[j]){
                    count++;
                    index = j+1;
                    break;
                }
            }
        }

        return count;
    }
}
