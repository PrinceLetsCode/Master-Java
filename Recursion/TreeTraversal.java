package Recursion;

import DataStructures.Tree.TreeNode;

public class TreeTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);
        root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(13);
        root.right.right.left = new TreeNode(14);
        root.right.right.right = new TreeNode(15);

        print_preOrder(root);
    }

    private static void print_preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        print_preOrder(root.left);
        print_preOrder(root.right);
    }

    private static void print_inOrder(TreeNode root) {
        if (root == null) {
            return ;
        }
        print_inOrder(root.left);
        System.out.println(root.val);
        print_inOrder(root.right);
    }

    private static void print_postOrder(TreeNode root) {
        if (root == null) {
            return ;
        }
        print_inOrder(root.left);
        print_inOrder(root.right);
        System.out.println(root.val);
    }
}
