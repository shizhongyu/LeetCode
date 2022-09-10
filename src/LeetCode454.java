import java.util.HashMap;
import java.util.Map;

public class LeetCode454 {
    public static void main(String[] args) {
        int [] nums1 = {2, 3};
        int [] nums2 = {-2, 3};
        int [] nums3 = {-2, 3};
        int [] nums4 = {2, 3};
        System.out.println(fourSumCount(nums1, nums2, nums3, nums4));
    }

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int i1 = 0; i1 < nums2.length; i1++) {
                int result = nums1[i] + nums2[i1];
                int value = 0;
                if (map.containsKey(result)) {
                    value = map.get(result);
                }
                map.put(result, value + 1);
            }
        }
        for (int i = 0; i < nums3.length; i++) {
            for (int i1 = 0; i1 < nums4.length; i1++) {
                int result = nums3[i] + nums4[i1];
                if (map.containsKey(-result))
                count += map.get(result);
            }
        }
        return count;
    }
}
