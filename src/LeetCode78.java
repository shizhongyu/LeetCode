import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode78 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        subsetHelp(results, nums, 0, new LinkedList<Integer>());
        return results;
    }

    public static void subsetHelp(List<List<Integer>> results, int[] nums, int startIndex, LinkedList<Integer> list) {
        results.add(new ArrayList<>(list));
        for (int i = startIndex; i < nums.length; i++) {
            list.add(nums[i]);
            System.out.println("----" + nums[i]);
            subsetHelp(results, nums, i + 1, list);
            list.removeLast();
            System.out.println("-----" + nums[i]);
        }
    }
}
