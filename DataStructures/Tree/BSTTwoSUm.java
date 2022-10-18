package DataStructures.Tree;

import java.util.HashMap;

public class BSTTwoSUm {
    HashMap<Integer,Integer> hm=new HashMap<>();
    public boolean findTarget(TreeNode root, int k){
        if(root==null){
            return false;
        }
        if(hm.containsKey(k-root.val)){
            return true;
        }
        hm.put(root.val,0);
        return findTarget(root.left,k)||findTarget(root.right,k);
    }
    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        System.out.println(new BSTTwoSUm().findTarget(root, 9));

    }

}
