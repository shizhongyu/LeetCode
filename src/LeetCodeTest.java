import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCodeTest {
    public static void main(String[] args) {

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
}
