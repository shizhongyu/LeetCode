package Node;

import java.util.HashMap;
import java.util.Map;

public class LeetCode337 {
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

        System.out.println(rob(t1));
    }

    public static int rob(TreeNode root) {
        Map<TreeNode, Integer> map = new HashMap<>();
        return solution(root, map);
    }

    public static int solution(TreeNode root, Map<TreeNode, Integer> map) {
        if(root == null) {
            return 0;
        }
        if(map.containsKey(root)) return map.get(root);
        int money = root.val;
        if(root.left != null) {
            money += solution(root.left.left, map) + solution(root.left.right, map);
        }
        if(root.right != null) {
            money += solution(root.right.left, map) + solution(root.right.right, map);
        }
        money = Math.max(money, solution(root.left, map) + solution(root.right, map));
        map.put(root, money);
        return money;
    }
}
