import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode40 {
    public static void main(String[] args) {
        int[] nums = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        combinationSum2(nums, target);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, result, 0, new LinkedList<>(), new boolean[candidates.length]);
        System.out.println(result);
        return result;
    }

    private static void dfs(int[] candidates, int target, List<List<Integer>> result, int index, LinkedList<Integer> list, boolean[] visited) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (target < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (visited[i]) {
                continue;
            }
            list.add(candidates[i]);
            visited[i] = true;
            dfs(candidates, target - candidates[i], result, i + 1, list, visited);
            list.removeLast();
            visited[i] = false;
        }
    }


}
