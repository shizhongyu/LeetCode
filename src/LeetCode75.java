import java.util.Arrays;
//https://leetcode.com/problems/sort-colors/discuss/26472/Share-my-at-most-two-pass-constant-space-10-line-solution
public class LeetCode75 {
    public static void main(String[] args) {
        int [] nums = { 2,0,1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length;
        for (int i = 0; i < right ; ) {
            if(nums[i] == 2) {
                swap(nums, i, --right);
            }else if(nums[i] == 0) {
                swap(nums, left++, i++);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] nums, int i , int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
