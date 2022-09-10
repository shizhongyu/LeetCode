package Node;

public class LintCode596 {

    static int result = Integer.MAX_VALUE;
    static TreeNode root = null;

    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(-5);
        TreeNode t3 = new TreeNode(2);
        TreeNode t4 = new TreeNode(1);
        TreeNode t5 = new TreeNode(2);
        TreeNode t6 = new TreeNode(-4);
        TreeNode t7 = new TreeNode(-5);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;


        System.out.println(getNode(t1));
        System.out.println(root);
    }


    private static int getNode(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int value = node.val;

        int leftValue = getNode(node.left);
        int rightValue = getNode(node.right);

        int rootValue = leftValue + rightValue + value;

        if (rootValue < result) {
            result = rootValue;
            root = node;
        }

        return rootValue;
    }


}
