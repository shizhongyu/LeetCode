import java.util.Arrays;

public class LeetCode977 {
    public static void main(String[] args) {
        int[] num = {-5, 1, 3, 6};
        int i = 0;
        int k = num.length;
        int j = num.length - 1;
        int[] nums = new int[k];
        while (i <= j) {
            int start = num[i] * num[i];
            int end = num[j] * num[j];
            if (start < end) {
                nums[--k] = end;
                j--;
            } else {
                i++;
                nums[--k] = start;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
