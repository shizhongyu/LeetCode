package Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode103 {

    public static void main(String[] args) {

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (result.size() % 2 == 0) {
                    list.add(size - i - 1, node.val);
                } else {
                    list.add(node.val);
                }
                if (node.right != null) queue.add(node.right);
                if (node.left != null) queue.add(node.left);
            }
            if (list.size() > 0)
                result.add(list);
        }
        return result;
    }
}
