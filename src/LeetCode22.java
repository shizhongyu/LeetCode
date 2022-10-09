import java.util.ArrayList;
import java.util.List;

public class LeetCode22 {
    public static void main(String[] args) {
        generateParenthesis(3);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        dfs(0,0, n * 2, "", list );
        System.out.println(list);
        return list;
    }

    public static void dfs(int open, int close, int max, String str, List<String> list) {
        if (str.length() == max) {
            list.add(str);
            return;
        }
        if (open < max / 2) {
            dfs(open + 1, close, max, str + "(", list);
        }
        if (close < open) dfs(open, close + 1, max, str + ")", list);
    }
}
