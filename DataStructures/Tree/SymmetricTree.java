package DataStructures.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SymmetricTree {


    public boolean isSymmetric_1(TreeNode root) {
        return root == null || isMirror(root.left, root.right); // if root is null, return true else call isMirror.

    }
    boolean isMirror(TreeNode node1, TreeNode node2) { // check if node1 and node2 are mirror images of each other.
        if (node1 == null && node2 == null) return true; // if both are null, return true.

        if (node1 == null || node2 == null) return false; // if one is null and other is not, return false.

        if (node1.val != node2.val) return false; // if both are not null and values are not equal, return false.

        // if both are not null and values are equal,
        // check if left of node1 is mirror image of right of node2 and right of node1 is mirror image of left of node2.
        return isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }



    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println(isSymmetric(root));
    }



    // can you find out why this is not working for few test cases?
    private static boolean isSymmetric(TreeNode root) {

        if(root==null) return true;
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
            if(!isPalindrome(level)) return false;
        }


        return true;
    }

    private static boolean isPalindrome(List<Integer> level) {

        int i=0;
        int j=level.size()-1;
        while(i<j){
            if(level.get(i)!=level.get(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
