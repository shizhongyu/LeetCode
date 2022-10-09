package Node;

public class LeetCode111 {
    public static void main(String[] args) {

    }

    public static int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(root.left != null && root.right == null) {
            return left + 1;
        }
        if(root.right != null && root.left == null) {
            return right +1;
        }
        return Math.min(left, right) + 1;
    }
}
