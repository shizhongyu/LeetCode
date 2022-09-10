import java.util.HashMap;
import java.util.Map;

public class LeetCode3 {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        int slow = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                // 所以加1不要取下表，取当前第几位。
                slow = Math.max(slow, map.get(c)) + 1;
            }
            map.put(c, i);
            result = Math.max(result, i - slow + 1);
        }
        return result;
    }
}
