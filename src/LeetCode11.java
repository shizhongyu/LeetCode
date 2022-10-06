import java.util.Arrays;

public class LeetCode11 {
    public static void main(String[] args) {
        int [] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println("args = " + maxArea(nums));
    }

    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int area  = 0;
        while (l < r) {
            area = Math.max(Math.min(height[l], height[r]) * (r - l), area);
            if(height[l] > height[r]) {
                r--;
            }else {
                l++;
            }
        }
        return area;
    }
}
