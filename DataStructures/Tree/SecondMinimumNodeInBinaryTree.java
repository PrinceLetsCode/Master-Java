package DataStructures.Tree;

import java.util.LinkedList;

public class SecondMinimumNodeInBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left= new TreeNode(2);
        root.right= new TreeNode(5);
        root.right.left= new TreeNode(5);
        root.right.right= new TreeNode(7);

        System.out.println(findSecondMinimumValue(root));
    }


    // using BFS
    private static int findSecondMinimumValue(TreeNode root) {
        if(root == null) return -1;
        LinkedList<TreeNode> queue = new LinkedList<>();
        int min = root.val;
        int secondMin = Integer.MAX_VALUE;

        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(node.val> min && node.val<secondMin) secondMin = node.val;
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
        return secondMin == Integer.MAX_VALUE ? -1 : secondMin;

    }

}
