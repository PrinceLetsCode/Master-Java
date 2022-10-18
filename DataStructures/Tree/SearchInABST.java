package DataStructures.Tree;

public class SearchInABST {


    //Time Complexity: O(N)
    //Space Complexity: O(N)

    public static TreeNode searchBST_1(TreeNode root, int val) {

        if (root == null || root.val == val) return root;// Base Cases: root is null or val is present at root
        if (root.val > val)
            return searchBST_1(root.left, val); // Value is greater than root's val then search in right side of the root
        return searchBST_1(root.right, val);//Value is smaller than root's val then search in left side of the root
    }


    //Time Complexity: O(N)
    //Space Complexity: O(1)
    public static TreeNode searchBST(TreeNode root, int val) {

        if (root == null) return null;//Base Condition(If tree is empty )
        while (root != null && root.val != val) {//Tree is not empty and root value is not equals to val
            root = val < root.val ? root.left : root.right;//terminatory condition if val smaller than root value then search in left side else on right side
        }
        return root;
    }

    public static void display(TreeNode root){
        if(root==null) return;
        display(root.left);
        System.out.print(root.val+" ");
        display(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        System.out.println();
        TreeNode result = searchBST(root, 2);
        display(result);
    }
}
