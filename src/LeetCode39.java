import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode39 {
    static List<List<Integer>> result = new ArrayList<>();
    static LinkedList<Integer> list = new LinkedList<>();

    public static void main(String[] args) {
        int [] nums = {2, 3, 6, 7};
        Arrays.sort(nums);
        backtracking(nums, 7, 0, 0);
        System.out.println(result);
    }

    public static void backtracking(int[] candidates, int target, int sum, int startIndex) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            if(candidates[i] > target) {
                break;
            }
            list.add(candidates[i]);
            sum += candidates[i];
            backtracking(candidates, target, sum, i);
            sum -= candidates[i];
            list.removeLast();
        }
    }


}
