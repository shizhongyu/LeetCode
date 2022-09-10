public class LeetCode242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("abb", "baa"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        int[] nums = new int[26];
        int length = s.length();
        for (int i = 0; i < length; i++) {
            int temp = s.charAt(i) - 'a';
            nums[temp]++;
            temp = t.charAt(i) - 'a';
            nums[temp]--;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
