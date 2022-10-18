package DataStructures.Tree;

public class InsertIntoABinaryTree {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return root=new TreeNode(val);

        if(root.val<val){
            root.right=insertIntoBST(root.right,val);
        }
        else if(root.val>val){
            root.left=insertIntoBST(root.left,val);
        }
        // your code here
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        System.out.println();
        TreeNode result = new InsertIntoABinaryTree().insertIntoBST(root, 5);
        display(result);
    }

    private static void display(TreeNode result) {
        if(result==null) return;
        display(result.left);
        System.out.print(result.val+" ");
        display(result.right);
    }
}
