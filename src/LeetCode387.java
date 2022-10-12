import java.util.HashMap;

public class LeetCode387 {
    public static void main(String[] args) {

    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Boolean> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(hashMap.containsKey(ch)) {
                hashMap.put(ch, false);
            }else {
                hashMap.put(ch, true);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(hashMap.get(ch)) {
                return i;
            }
        }
        return -1;
    }
}
