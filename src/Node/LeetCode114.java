package Node;

public class LeetCode114 {
    private static TreeNode pre;

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(8);
        TreeNode t8 = new TreeNode(7);
        TreeNode t9 = new TreeNode(4);

        t1.left = t2;
        t1.right = t5;
        t2.left = t3;
        t2.right = t4;
        t5.right = t6;

        flatten(t1);
//        flattenNode(t1);
//        System.out.println(t1);
    }

    public static TreeNode flattenNode(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode leftLast = flattenNode(root.left);
        TreeNode rightLast = flattenNode(root.right);

        if (root.left != null) {
            leftLast.right = root.right;
            root.right = root.left;
            root.left = null;
        }

        if (rightLast != null) {
            return rightLast;
        } else if (leftLast != null) {
            return leftLast;
        }
        return root;
    }

    public static void flatten(TreeNode root) {
        if (root == null)
            return;
        flatten(root.right);
        flatten(root.left);
        root.right = pre;
        root.left = null;
        pre = root;
    }

}
