package Node;

public class LeetCode98 {

    static long pre = -Long.MAX_VALUE;

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(6);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(7);
//        TreeNode t6 = new TreeNode(6);
        t1.left = t2;
        t1.right = t3;
        t3.left = t4;
        t3.right = t5;

        isValidBST(t1, Long.MAX_VALUE, -Long.MIN_VALUE);

    }


    public static boolean isValidBST(TreeNode root, long maxValue, long minValue) {
        if (root == null) {
            return true;
        }
        if (root.val >= maxValue || root.val <= minValue) return false;
        return isValidBST(root.left, root.val, minValue) && isValidBST(root.right, maxValue, root.val);
    }

    public static boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (!isValidBST(root.left)) {
            return false;
        }
        if (root.val < pre) {
            return false;
        }
        pre = root.val;
        return isValidBST(root.right);
    }
}
