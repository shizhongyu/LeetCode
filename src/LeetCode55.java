public class LeetCode55 {
    public static void main(String[] args) {
        int [] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int cover = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i > cover) return false;
            cover = Math.max(cover, i + nums[i]);
        }
        return true;
    }
}
