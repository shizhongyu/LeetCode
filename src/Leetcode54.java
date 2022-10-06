import java.util.ArrayList;
import java.util.List;

public class Leetcode54 {
    public static void main(String[] args) {
        int [][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(nums));
    }

    /**
     * 参考 https://leetcode.cn/problems/spiral-matrix/solution/cxiang-xi-ti-jie-by-youlookdeliciousc-3/
     * @param matrix
     * @return
     */
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int l = 0;
        int r = matrix[0].length - 1;
        int d = matrix.length - 1;
        int u = 0;
        while (true) {
            // 向右
            for (int i = l; i <= r; i++) {
                list.add(matrix[u][i]);
            }
            if(++u > d) {
                break;
            }
            // 向下
            for (int i = u; i <= d; i++) {
                list.add(matrix[i][r]);
            }
            if(--r < l) {
                break;
            }
            // 向左
            for (int i = r;i >= l; i--) {
                list.add(matrix[d][i]);
            }
            if(--d < u) {
                break;
            }
            // 向上
            for (int i = d; i >= u; i--) {
                list.add(matrix[i][l]);
            }
            if (++l > r) {
                break;
            }
        }
        return list;
    }
}
