    package DataStructures.Tree;

    public class ValidateBinarySearchTree {
        public static void main(String[] args) {
            TreeNode root = new TreeNode(2);
            root.left = new TreeNode(1);
            root.right = new TreeNode(3);
            System.out.println(isValidBST(root));
        }

        private static boolean isValidBST(TreeNode root) {
            return isValidBST(root,Long.MIN_VALUE, Long.MAX_VALUE);
        }

        private static boolean isValidBST(TreeNode root, long minValue, long maxValue) {
            if (root == null) {
                return true;
            }
            if (root.val <= minValue || root.val >= maxValue) {
                return false;
            }
            return isValidBST(root.left, minValue, root.val) && isValidBST(root.right, root.val, maxValue);
        }


    }
