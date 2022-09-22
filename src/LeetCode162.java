public class LeetCode162 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        int start = 1;
        int end = nums.length - 2;

        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid - 1]) {
                end = mid;
            } else if (mid < nums[mid + 1]) {
                start = mid;
            } else {
                return mid;
            }
        }
        return Math.max(nums[start], nums[end]);
    }
}
