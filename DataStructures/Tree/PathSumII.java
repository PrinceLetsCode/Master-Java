package DataStructures.Tree;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
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

    private static List<List<Integer>> hasPathSum(TreeNode root, int target) {
        // creating a list of lists of integers for storing the paths
        List<List<Integer>> list = new ArrayList<>();

        // creating a list of integers for storing the path
        List<Integer> path = new ArrayList<>();

        // calling the pathSum method
        pathSum(root, target, list, path);

        // returning the list of lists of integers
        return list;

    }

    private static List<List<Integer>> pathSum(TreeNode root, int target, List<List<Integer>> list, List<Integer> path) {
        // base case
        if (root == null) {
            return list;
        }

        // adding the root value to the path
        path.add(root.val);

        // if the root is a leaf node and the target is equal to the root value then add the path to the list
        if (root.left == null && root.right == null && target - root.val == 0) {
            list.add(new ArrayList<>(path));
        }

        // calling the pathSum method for left and right subtree
        pathSum(root.left, target - root.val, list, path);
        pathSum(root.right, target - root.val, list, path);

        // removing the last element from the path if the root is not a leaf node and the target is not equal to the root value
        path.remove(path.size() - 1);

        // returning the list of lists of integers
        return list;
    }
}
