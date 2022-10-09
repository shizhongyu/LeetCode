import java.util.*;

public class LeetCodeTest {
    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
        System.out.println(threeSum(nums));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, new LinkedList<>(), 0, nums);
        return result;
    }

    public void dfs(List<List<Integer>> result, LinkedList<Integer> list, int index, int[] nums) {
        result.add(new ArrayList<>(list));
        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            dfs(result, list, i + 1, nums);
            list.removeLast();
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set =  new HashSet<>();
        Arrays.sort(nums);
        int slow = 0;
        int fast = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                break;
            }
            slow = i + 1;
            int target = -nums[i];
            while (slow < fast) {
                if (nums[slow] + nums[fast] == target) {
                    List<Integer> result = new ArrayList<>();
                    result.add(nums[slow]);
                    result.add(nums[fast]);
                    result.add(nums[i]);
                    set.add(result);
                    fast--;
                    slow++;
                } else if (nums[slow] + nums[fast] > target) {
                    fast--;
                } else {
                    slow++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
