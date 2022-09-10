package Node;

import java.util.ArrayList;
import java.util.List;

public class LeetCode404 {
    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(9);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(15);
        TreeNode t5 = new TreeNode(7);

        t1.left = t2;
        t1.right = t3;
        t3.right = t5;
        t3.left = t4;
        List<Integer> sum = new ArrayList<>();

        int number = sumOfLeftLeaves(t1);
        System.out.println(number);
    }

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sum = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }
        int leftVal = sumOfLeftLeaves(root.left);

        int rightVal = sumOfLeftLeaves(root.right);
        return sum + leftVal + rightVal;
    }


}
