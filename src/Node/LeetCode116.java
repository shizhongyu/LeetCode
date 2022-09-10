package Node;


import java.util.LinkedList;
import java.util.Queue;

public class LeetCode116 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;


    }

    /**
     * 需要额外的存储空间
     *
     * @param root
     * @return
     */
    public TreeNode connect(TreeNode root) {
        if (root == null) {
            return root;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode next = null;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                node.next = next;
                next = node;
                if (node.right != null) queue.add(node.right);
                if (node.left != null) queue.add(node.left);
            }
        }
        return root;
    }

    public static TreeNode connect2(TreeNode root) {
        if (root == null) {
            return root;
        }
        if (root.left != null) {
            root.left = root.right;
            if (root.next != null) {
                root.right = root.next.left;
            }
        }
        connect2(root.left);
        connect2(root.right);
        return root;
    }
}
