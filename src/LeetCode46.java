import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode46 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        permute(nums);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null) {
            return result;
        }
        if (nums.length == 0) {
            result.add(new ArrayList<>());
            return result;
        }

        boolean[] visited = new boolean[nums.length];
        LinkedList<Integer> list = new LinkedList<>();
        dfs(nums, visited, list, result);
        System.out.println(result);
        return result;
    }

    private static void dfs(int[] nums, boolean[] visited, LinkedList<Integer> list, List<List<Integer>> result) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }
            visited[i] = true;
            list.add(nums[i]);
            dfs(nums, visited, list, result);
            visited[i] = false;
            list.removeLast();
        }
    }

}
