import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode15 {
    public static void main(String[] args) {
        int [] nums = {-0,0,0, 0};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return result;
            }
            int start = i + 1;
            int end = nums.length - 1;
            // 第一个数字去重
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (start < end) {
                int sumResult = nums[i] + nums[start] + nums[end];
                if (sumResult == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    result.add(list);
                    start++;
                    end--;
                    // 第三个数字去重
                    while (end  > start && nums[end] == nums[end + 1]) {
                        end--;
                    }
                    // 第二个数字去重
                    while (end > start && nums[start] == nums[start - 1]) {
                        start++;
                    }
                } else if (sumResult > 0) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return result;
    }
}
