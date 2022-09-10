import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {
    public static void main(String[] args) {
        int [] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, 9)));

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if(map.containsKey(need)) {
                result[0] = i;
                result[1] = map.get(need);
                return result;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
