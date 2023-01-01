package DataStructures.Tree;

public class IsSameTrue {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        System.out.println(isSameTree(root, root));
    }

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        // if both are null return true
        if(p==null && q==null) return true;
        // if one of them is null return false
        if(p==null || q==null) return false;
        // if both does not have same value return false
        if(p.val!=q.val) return false;
        // if both have same value then check for left and right
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
