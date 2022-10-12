package Offer;

public class Offer03 {
    public static void main(String[] args) {

    }

    public static int findRepeatNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if(nums[i] == i) {
                i++;
                continue;
            }
            if(nums[nums[i]] == nums[i]) {
                return nums[i];
            }
            int temp = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temp;
        }
        return -1;
    }
}
