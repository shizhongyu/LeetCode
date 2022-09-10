package Node;

import java.util.ArrayList;
import java.util.List;

public class LeetCode230 {

    static int result = 0;
    static int n = 1;

    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(4);
//        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(2);
//        TreeNode t6 = new TreeNode(6);
        t1.left = t2;
        t1.right = t3;
//        t2.left = t4;
        t2.right = t5;
//        t3.left = t6;

        dfs2(t1);
        System.out.println(result);

    }


    List<TreeNode> list = new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {

        dfs(root);

        if (k > list.size()) {
            return 0;
        }
        return list.get(k - 1).val;
    }

    public void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        if (node != null)
            list.add(node);

        dfs(node.right);
    }


    public static void dfs2(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs2(node.left);
        n--;
        System.out.println(node.val + "  ,,");
        if (n == 0) {
            result = node.val;
            return;
        }
        dfs2(node.right);
    }

}
