package DataStructures.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        System.out.println(binaryTreePaths(root));
    }

    private static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        if (root.left == null && root.right == null) {
            result.add(root.val + "");
            return result;
        }

        List<String> leftPaths = binaryTreePaths(root.left);
        for (String path : leftPaths) {
            result.add(root.val + "->" + path);
        }

        List<String> rightPaths = binaryTreePaths(root.right);
        for (String path : rightPaths) {
            result.add(root.val + "->" + path);
        }

        return result;
    }


}
