import java.util.Arrays;

public class LeetCode169 {
    public static void main(String[] args) {

    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    /**
     * HashMap 统计出现次数
     * @param nums
     * @return
     */
    public static int majorityElement01(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
