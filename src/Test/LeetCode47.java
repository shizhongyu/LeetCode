package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode47 {
    public static void main(String[] args) {
        System.out.println(permuteUnique(new int[]{1, 1, 2, 1}));
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();

        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        dfs(result, list, nums, visited);
        return result;
    }

    public static void dfs(List<List<Integer>> result , LinkedList<Integer> list, int[] nums , boolean[]visited) {
        if(list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(visited[i]) {
                continue;
            }

            if(i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
                continue;
            }
            visited[i] = true;
            list.add(nums[i]);
            dfs(result, list, nums, visited);
            visited[i] = false;
            list.removeLast();
        }
    }

}
