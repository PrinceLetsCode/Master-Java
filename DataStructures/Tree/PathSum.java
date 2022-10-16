package DataStructures.Tree;

public class PathSum {

    public static boolean hasPathSum(TreeNode root, int targetSum) {

        // if root is null, return false
        if(root==null) return false;
        // if root is leaf node and value of root is equal to targetSum, return true
        if(root.left==null && root.right==null && root.val==targetSum) return true;
        // if root is not leaf node, recursively call hasPathSum for left and right subtree
        // and return true if either of them returns true.
        return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        System.out.println(hasPathSum(root, 22));
    }
}
