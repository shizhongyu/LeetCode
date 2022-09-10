package Node;

import java.util.ArrayList;
import java.util.List;

public class LeetCode230 {

    public static void main(String[] args) {
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

}
