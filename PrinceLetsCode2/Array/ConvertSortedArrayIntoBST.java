package PrinceLetsCode2.Array;

import DataStructures.Tree.TreeNode;

public class ConvertSortedArrayIntoBST {
    public static void main(String[] args) {
        int[] arr = {-10,-3,0,5,9};
        TreeNode root = sortedArrayToBST(arr);
        printTree(root);
    }

    private static void printTree(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.println(root.val);
        printTree(root.left);
        printTree(root.right);
    }

    private static TreeNode sortedArrayToBST(int[] arr) {
        return helper(arr, 0, arr.length - 1);
    }

    private static TreeNode helper(int[] arr, int low, int high) {
        if(low> high){
            return null;
        }

        int mid  =  low + (high-low)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = helper(arr, low, mid-1);
        root.right = helper(arr, mid+1, high);
        return root;

    }
}
