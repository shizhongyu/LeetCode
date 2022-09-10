//https://github.com/youngyangyang04/leetcode-master/blob/master/problems/0005.%E6%9C%80%E9%95%BF%E5%9B%9E%E6%96%87%E5%AD%90%E4%B8%B2.md
public class LeetCode5 {

    public static void main(String[] args) {
        String str = "babad";
        System.out.println(longestPalindrome(str));
    }

    public static String longestPalindrome(String s) {
        int length = s.length();
        String currentStr = "";
        for (int i = 0; i < length; i++) {
            String strOdd = isPalindrome(s, i, i);
            if (strOdd.length() > currentStr.length()) {
                currentStr = strOdd;
            }
            String strEven = isPalindrome(s, i, i + 1);
            if (strEven.length() > currentStr.length()) {
                currentStr = strEven;
            }
        }
        return currentStr;
    }

    public static String isPalindrome(String str, int start, int end) {
        int length = str.length();
        while (start >= 0 && end < length && str.charAt(start) == str.charAt(end)) {
            start--;
            end++;
        }
        return str.substring(start + 1, end);
    }

}
