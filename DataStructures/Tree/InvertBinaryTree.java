package DataStructures.Tree;

public class InvertBinaryTree {

    public static TreeNode invertTree(TreeNode root) {

        // Base case
        if (root == null) {
            return null;
        }

        // Recursive case
        TreeNode left = invertTree(root.left); // get the left subtree
        TreeNode right = invertTree(root.right); // get the right subtree

        root.left = right; // Swap the values
        root.right = left; // Swap the values

        // Return the root
        return root;

    }

    public static void display(TreeNode root) {
        if (root == null) {
            return;
        }
        String str = "";
        str += root.left == null ? "." : root.left.val;
        str += " <- " + root.val + " -> ";
        str += root.right == null ? "." : root.right.val;
        System.out.println(str);
        display(root.left);
        display(root.right);
    }

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

        display(root);
        invertTree(root);
        System.out.println();
        System.out.println();

        display(root);
    }
}
