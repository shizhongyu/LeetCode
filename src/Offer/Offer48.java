package Offer;

import java.util.HashMap;
import java.util.Map;

public class Offer48 {
    public static void main(String[] args) {
        String  str = "abba";
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int slow = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 1; i <= s.length(); i++) {
            char ch = s.charAt(i - 1);
            if(map.containsKey(ch)) {
                slow = Math.max(slow, map.get(ch));
            }
                max = Math.max(max, i - slow);

            map.put(ch,i);
        }
        return max;
    }

}
