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

    }

    private static void flatten(TreeNode root) {
        if(root == null) {
            return ;
        }
        flatten(root.right);
        flatten(root.left);
        root.right = pre;
        pre = root;
        root.left = null;
    }


}
