package leetCode;

import DataStructures.Tree.TreeNode;

public class LinkedListInBinaryTree {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(8);
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(1);
        root.left.right.right = new TreeNode(2);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);
        root.right.left.left = new TreeNode(6);
        root.right.left.right = new TreeNode(8);
        root.right.right = new TreeNode(1);
        root.right.right.left = new TreeNode(1);
        root.right.right.right = new TreeNode(4);
        System.out.println(isSubPath(head, root));
    }

    private static boolean isSubPath(ListNode head, TreeNode root) {
        if (head == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (checkMatch(head, root)) {
            return true;
        }
        return isSubPath(head, root.left) || isSubPath(head, root.right);

    }

    private static boolean checkMatch(ListNode head, TreeNode node) {
        if (head == null) {
            return true;
        }
        if (node == null) {
            return false;
        }
        if (head.val != node.val) {
            return false;
        }
        return checkMatch(head.next, node.left) || checkMatch(head.next, node.right);
    }
}
