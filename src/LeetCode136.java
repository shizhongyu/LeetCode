import java.util.Arrays;

public class LeetCode136 {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i = i + 2) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }
            if (nums[i + 1] == nums[i + 2]) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }
}
