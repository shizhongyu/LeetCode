import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode49 {
    public static void main(String[] args) {
        String[] strs  = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char [] ac = new char[26];
            for (char c : str.toCharArray()) {
                ac[c - 'a']++;
            }
//            Arrays.sort(ac);
            String temp = String.valueOf(ac);
            List<String> list = map.getOrDefault(temp, new ArrayList<>());
            list.add(str);
            map.put(temp, list);
        }
        return new ArrayList<>(map.values());
    }
}
