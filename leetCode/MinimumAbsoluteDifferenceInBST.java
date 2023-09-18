package leetCode;

import DataStructures.Tree.TreeNode;

public class MinimumAbsoluteDifferenceInBST {
    public static void main(String[] args) {

    }

    private static int getMinimumDifference(TreeNode root){
        int min = Integer.MAX_VALUE;
        Integer prev = null;

        return getMinimumDifference(root, min, prev);
    }

    private static int getMinimumDifference(TreeNode root, int min, Integer prev) {
        if(root == null) return min;

        getMinimumDifference(root.left,min,prev);
        if (prev!=null){
            min = Math.min(min,root.val - prev);
        }
        prev = root.val;

        getMinimumDifference(root.right, min, prev);
        return min;
    }
}
