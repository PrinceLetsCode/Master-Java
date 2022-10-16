package DataStructures.Tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LevelOrderTraversal {

    static List<List<Integer>> list = new LinkedList<>();

    public static List<List<Integer>> levelOrder(TreeNode root) {
        int height = height(root);  //store height of tree
        for (int i = 0; i <= height; i++) { //for each level
            list.add(printLevel(root, i)); //print nodes at each level
        }
        return list;
    }

    private static List<Integer> printLevel(TreeNode root, int i) {
        List<Integer> level;
        if (root == null) {
            return null;
        }
        if (i == 0) {
            level = new LinkedList<>();
            level.add(root.val);
            return level;
        } else if (i > 0) {
            level = new LinkedList<>();
            level.addAll(printLevel(root.left, i - 1));
            level.addAll(printLevel(root.right, i - 1));
            return level;
        }
        return null;
    }

    public static int height(TreeNode root) { // height of the tree
        if (root == null) return -1;       // height of empty tree is -1
        else {                        // height of non-empty tree is 1 + max of left and right subtree
            int lheight = height(root.left);
            int rheight = height(root.right);
            if (lheight > rheight) return lheight + 1;
            else return rheight + 1;
        }
    }


    public static List<List<Integer>> levelOrder2(TreeNode root) {
        if (root == null) return Collections.emptyList();  //return empty list if root is null
        List<List<Integer>> levels = new LinkedList<>();  //create a list of lists
        LinkedList<TreeNode> queue = new LinkedList<>();    //create a queue
        queue.add(root); //add root to queue
        while (!queue.isEmpty()) { //while queue is not empty
            int size = queue.size(); //store size of queue
            List<Integer> level = new LinkedList<>(); //create a list to store nodes at each level
            for (int i = 0; i < size; i++) { //for each node in queue
                TreeNode node = queue.poll(); //remove node from queue
                level.add(node.val); //add node to level list
                if (node.left != null) queue.add(node.left); //add left child to queue
                if (node.right != null) queue.add(node.right);  //add right child to queue
            }
            levels.add(level); //add level list to levels list
        }
        return levels; //return levels list
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

        System.out.println(height(root));
        System.out.println(levelOrder(root));
        System.out.println(levelOrder2(root));
    }
}
