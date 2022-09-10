import com.sun.tools.javac.Main;

public class LeetCode209 {
    public static void main(String[] args) {
        int[] nums = {10, 8, 3, 20, 20, 8, 0};
        System.out.println(minSubArrayLen(30, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int j = 0;
        int i = 0;
        int length = nums.length;
        int window = 0;
        for (j = 0; j < length; j++) {
            window += nums[j];
            while (window >= target) {
                result = Math.min(result, j - i + 1);
                window -= nums[i++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
