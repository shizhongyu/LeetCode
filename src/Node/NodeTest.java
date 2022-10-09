package Node;

public class NodeTest {
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
        isValidBST(t1);
    }


    public void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        dfs(node.left);
        dfs(node.right);
    }

    public static  boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        int center = root.val;
        boolean left = true;
        if(root.left != null) {

            left=    root.left.val < center;
        }
        boolean right = true;
        if(root.right != null) {

            right =    root.right.val > center;
        }
        if (!left || !right) {
            return false;
        }
        boolean leftBST = isValidBST(root.left);
        boolean rightBST = isValidBST(root.right);
        return leftBST && rightBST;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == q || root == p) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null &&right != null) {
            return root;
        }else if(left != null && right == null) {
            return left;
        }else if(right != null &&left == null) {
            return right;
        }else {
            return null;
        }
    }
}
