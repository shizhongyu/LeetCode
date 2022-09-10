import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode77 {
    static LinkedList<Integer> list = new LinkedList<>();
    static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        backtracking(4, 2, 1);
        System.out.println(result);
    }

    public static void backtracking(int n, int k, int startIndex) {
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        }
        int maxLength = n - (k - list.size()) + 1;
        for (int i = startIndex; i <= maxLength; i++) {
            list.add(i);
            backtracking(n, k, i + 1);
            list.removeLast();
        }
    }
}
