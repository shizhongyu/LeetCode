package Node;

public class BalancedBinaryTree {
    public static void main(String[] args) {

    }

    public int isBalance(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = isBalance(root.left);
        if (left == -1) {
            return left;
        }
        int right = isBalance(root.right);
        if (right == -1) {
            return right;
        }
        return Math.abs(left - right) > 1 ? -1 : Math.max(left, right) + 1;
    }
}
