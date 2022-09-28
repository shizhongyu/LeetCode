import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] nums1 = {3, 2, 4};
        int target = 9;
//        System.out.println(Arrays.toString(twoSum(nums, 9)));
        System.out.println(Arrays.toString(twoSum2(nums1, 6)));
    }

    /**
     * HashMap
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                result[0] = i;
                result[1] = map.get(need);
                return result;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }

    /**
     * 同向双指针
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
//        Arrays.sort(nums);
        int j = 1;
        for (int i = 0; i < nums.length; i++) {
            j = i + 1;
            while (j < nums.length && target != nums[i] + nums[j]) {
                j++;
            }
            if (j >= nums.length) {
                continue;
            }
            if (nums[i] + nums[j] == target) {
                result[0] = i;
                result[1] = j;
                break;
            }
        }
        return result;
    }
}
