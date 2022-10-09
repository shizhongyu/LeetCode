package Node;

import java.util.List;

public class LeetCode94 {
    public static void main(String[] args) {

    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        return null;
    }

    public  void dfs(TreeNode root, List<Integer> list) {
       if(root == null) {
           return;
       }
        dfs(root.left, list);
         list.add(root.val);
        dfs(root.right, list);
    }
}
