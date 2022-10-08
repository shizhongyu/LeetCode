import java.util.HashSet;
import java.util.Set;

public class LeetCode128 {
    public static void main(String[] args) {
        int [] nums =    {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));

    }

    public static int longestConsecutive(int[] nums) {
        int best = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (Integer integer : set) {
            if (!set.contains(integer - 1)) {
                int m = integer + 1;
                while (set.contains(m)) {
                    m++;
                }
                best = Math.max(m - integer, best);
            }
        }
        return best;
    }
}
