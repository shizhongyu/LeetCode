public class LeetCode35 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if (nums[end] < target) {
            return nums.length;
        }
//        if (nums[start] >= target) {
//            return start;
//        }
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid;
            } else if (nums[mid] <= target) {
                start = mid;
            }
        }


        return end;

    }
}
