package Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode257 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        t1.left = t2;
        t1.right = t3;
//        t2.left = t4;
        t2.right = t5;
//        t3.left = t6;

        List<String> result = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        treePaths(t1, result, list);
        System.out.println(result);
    }

    private static void treePaths(TreeNode root, List<String> result, LinkedList<Integer> list) {
        if (root != null) {
            list.add(root.val);
        }
        if (root.left == null && root.right == null) {
            result.add(getValue(list));
            return;
        }
        if (root.left != null) {
            treePaths(root.left, result, list);
            list.removeLast();

        }
        if (root.right != null) {
            treePaths(root.right, result, list);
            list.removeLast();
        }
    }

    private static String getValue(LinkedList<Integer> list) {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str += list.get(i);
            if (i != list.size() - 1) {
                str += "->";
            }
        }
        return str;
    }
}
