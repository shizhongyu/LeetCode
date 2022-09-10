import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode131 {

    public static void main(String[] args) {
        List<List<String>> result = new ArrayList<>();
        LinkedList<String> list = new LinkedList<>();
        String str = "aab";
        String test = "A man, a plan, a canal: Panama";
//        System.out.println(isPalindrome(test, 0, str.length() - 1));
        backtracking(result, list, str, 0, str.length());
        System.out.println(result);
    }


    public static void backtracking(List<List<String>> result, LinkedList<String> list, String str, int startIndex, int length) {
        if (startIndex >= length) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = startIndex; i < length; i++) {
            if (isPalindrome(str, startIndex, i )) {
                String subString = str.substring(startIndex, i + 1);
                list.add(subString);
            } else {
                continue;
            }
            backtracking(result, list, str, i + 1,length);
            list.removeLast();
        }
    }

    private static boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}





