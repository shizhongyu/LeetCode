import java.util.Arrays;

public class LeetCode912 {
    public static void main(String[] args) {
        int[] nums = {-1, 2, -8, -10};
        sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }


    /**
     * 快速排序
     * https://www.bilibili.com/video/BV1K44y1k79z?spm_id_from=333.337.search-card.all.click&vd_source=4f6e3c370a3e292341287c0fd0e1b24c
     *
     * @param nums
     * @param start
     * @param end
     */
    public static void sort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int left = start;
        int right = end;

        //注意点 全部是小于等于
        int mid = nums[(start + end) / 2];
        while (left <= right) {
            // 基准点选取中间
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
