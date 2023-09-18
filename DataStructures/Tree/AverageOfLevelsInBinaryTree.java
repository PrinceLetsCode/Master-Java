package DataStructures.Tree;


import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AverageOfLevelsInBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left= new TreeNode(2);
        root.right= new TreeNode(3);
        root.left.left= new TreeNode(4);
        root.left.right= new TreeNode(5);
        root.right.left= new TreeNode(6);
        root.right.right= new TreeNode(7);

        System.out.println(averageOfLevels(root));
    }

    private static List<Double> averageOfLevels(TreeNode root) {
        List<Double> avgList = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            double sum = 0;
            for (int i = 0; i< size;i++){
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            avgList.add(sum/size);
        }
        return avgList;
    }
}
