package DataStructures.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left= new TreeNode(2);
        root.right= new TreeNode(3);
        root.left.left= new TreeNode(4);
        root.left.right= new TreeNode(5);
        root.right.left= new TreeNode(6);
        root.right.right= new TreeNode(7);

        System.out.println(breadthFirstSearch(root));
    }

    private static List<List<Integer>> breadthFirstSearch(TreeNode root) {
        if (root == null) return new LinkedList<>();

        List<List<Integer>> levels = new LinkedList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new LinkedList<>();
            for(int i = 0; i< size; i++){
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            levels.add(level);
        }
        return levels;

    }
}
