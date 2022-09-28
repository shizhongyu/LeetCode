import java.util.Arrays;

public class LeetCode26 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        System.out.println(removeDuplicates(nums));
        System.out.println(removeDuplicates2(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int fast = 1;
        int i = 0;
        for (; i < nums.length; i++) {
            while (fast < nums.length && nums[fast] == nums[i]) {
                fast++;
            }
            if (fast >= nums.length) {
                break;
            }
            nums[i + 1] = nums[fast];
        }
        System.out.println(Arrays.toString(nums));
        return i + 1;
    }

    public static int removeDuplicates2(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (i == 0 || num > nums[i - 1]) {
                nums[i++] = num;
            }
        }
        return i;
    }

}
