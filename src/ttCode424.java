import java.util.HashMap;

public class ttCode424 {
    public static void main(String[] args) {
        String str = "ABAB";
        int target = 1;
        System.out.printf( "" +characterReplacement(str, target));
    }

    public static int characterReplacement(String s, int k) {
        int fast = 0;
        int maxQueue = 0;
        int answer = 0;
        HashMap<Character, Integer> counter = new HashMap<>();
        for (int slow = 0; slow < s.length(); slow++) {
            while (fast < s.length() && fast - slow - maxQueue <= k) {
                int count = counter.getOrDefault(s.charAt(fast), 0) + 1;
                maxQueue = Math.max(count, maxQueue);
                counter.put(s.charAt(fast), count);
                fast++;
            }

            if (fast - slow - maxQueue > k) {
                answer = Math.max(answer,fast - slow - 1);
            } else {
                answer = Math.max(answer,fast - slow);
            }
            int count = counter.getOrDefault(s.charAt(slow), 0) - 1;
            counter.put(s.charAt(slow), count);
            maxQueue = getMaxQueue(counter);

        }
        return answer;
    }

    public static int getMaxQueue(HashMap<Character, Integer> map) {
        int max = 0;
        for (Integer value : map.values()) {
            max = Math.max(max, value);
        }
        return max;
    }
}
