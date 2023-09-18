package DataStructures.Tree;

public class HeightBalancedBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(isBalanced(root));
    }

    private static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        if (Math.abs(leftDepth - rightDepth) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);

    }

    private static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = 1 + maxDepth(root.left);
        int rightDepth = 1 + maxDepth(root.right);

        return Math.max(leftDepth, rightDepth);
    }

}
