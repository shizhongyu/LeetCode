import java.util.Arrays;

public class LeetCode48 {
    public static void main(String[] args) {
        int [][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print("" + nums[i][j]);
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 - i][j];
                matrix[matrix.length - 1 -  i][j] = temp;
            }
        }

        for (int i = 0; i < matrix.length ; i++) {
            // 对角折叠这里是小于i
            for (int j = 0; j < i ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
