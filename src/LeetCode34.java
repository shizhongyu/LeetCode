import java.util.Arrays;

public class LeetCode34 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
//        System.out.println(searchRange(nums, 8));
        searchInsert(nums, target);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if (nums == null || nums.length == 0) {
            return result;
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

        return result;
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums[0] > target) {
            return 0;
        }
        if (nums[nums.length - 1] < target) {
            return nums.length - 1;
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
