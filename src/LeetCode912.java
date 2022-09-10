import java.util.Arrays;

public class LeetCode912 {
    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }


    public static void sort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int left = start;
        int right = end;

        //注意点 全部是小于等于
        while (left <= right) {
            // 基准点选取中间
            int mid = nums[(start + end) / 2];
            while (left <= right && nums[left] < mid) {
                left++;
            }
            while (left <= right && nums[right] > mid) {
                right--;
            }
            if (left <= right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        // left 和 right 注意，此时已经left > right
        sort(nums, start, right);
        sort(nums, left, end);
    }


}
