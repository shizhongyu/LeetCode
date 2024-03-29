import java.util.Arrays;

public class LeetCode704 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid;
            } else if (nums[mid] < target) {
                start = mid;
            } else {
                start = mid;
                System.out.println(mid);
            }
        }
        if (nums[start] == target) {
            return start;
        }

        if (nums[end] == target) {
            return end;
        }
        return -1;
    }
}
