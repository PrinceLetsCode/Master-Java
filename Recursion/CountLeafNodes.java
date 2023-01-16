package Recursion;

import DataStructures.Tree.TreeNode;

public class CountLeafNodes {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        int count=0;
        System.out.println(count_leaf_nodes(root,count));
    }


    private static int count_leaf_nodes(TreeNode root, int count) {
        if (root == null) {
            return count;
        }
        if (root.left == null && root.right == null) {
            count++;
        }
        count=count_leaf_nodes(root.left,count);
        count=count_leaf_nodes(root.right,count);
        return count;
    }

}
