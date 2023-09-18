package DataStructures.Tree;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(maxDepth(root));
    }


//    time complexity: O(n)
//    space complexity: O(n)
    private static int maxDepth(TreeNode root) {

//        base case -> if root is null, return 0
        if (root == null) {
            return 0;
        }

        // if root is not null, then we have to find the max depth of left subtree and right subtree
        // add 1 to the max of left and right subtree
        int left = 1 + maxDepth(root.left);
        int right = 1+ maxDepth(root.right);

//        return the max of left and right subtree
        return Math.max(left, right) ;
    }
}
