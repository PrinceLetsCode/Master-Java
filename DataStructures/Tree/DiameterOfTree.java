package DataStructures.Tree;

public class DiameterOfTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(diameterOfBinaryTree(root));
    }

    private static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);

        return Math.max(left + right, Math.max(leftDiameter, rightDiameter));
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
