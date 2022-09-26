import java.util.ArrayList;
import java.util.List;

public class LeetCode17 {
    public static void main(String[] args) {
        letterCombinations("23");
    }

    public static List<String> letterCombinations(String digits) {
        String[] KEY_WORD = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        dfs(KEY_WORD, 0, "", result, digits);
        System.out.println(result);
        return result;
    }

    public static void dfs(String[] keyWord, int index, String str, List<String> result, String digits) {
        if (str.length() == digits.length()) {
            result.add(str);
            return;
        }
        int m = digits.charAt(index) - '0';
        for (int i = 0; i < keyWord[m].length(); i++) {
            dfs(keyWord, index + 1, str + keyWord[m].charAt(i), result, digits);
        }
    }
}
