import java.io.StringWriter;

public class LeetCode151 {
    public static void main(String[] args) {
        String str = "   hello   world  ";
        char[] chars = str.toCharArray();
        int length = chars.length;
        // step 1. reverse the whole string
        revert3(chars, 0, length - 1);
        // step 2.  clean up spaces
        length = cleanSpace(chars);
        // step 3. reverse each word
        String  string = revertEachWord(chars, length);
        System.out.println(""+ string);
    }

    public static int cleanSpace(char[] chars) {
        int fast = 0;
        int slow = 0;
        int size = chars.length;
        for (fast = 0; fast < size; fast++) {
            if (chars[fast] != ' ') {
                if (slow != 0) {
                    chars[slow++] = ' ';
                }
                while (fast < size && chars[fast] != ' ') {
                    chars[slow] = chars[fast];
                    slow++;
                    fast++;
                }
            }
        }
        return slow;
    }

    public static String revertEachWord(char[] chars, int length) {
        int fast = 0;
        int slow = 0;

        for (fast = 0; fast <= length; fast++) {
            if (fast == length || chars[fast] == ' ' ) {
                revert3(chars, slow, fast - 1);
                slow = fast + 1;
            }
        }
        return new String(chars).substring(0, length);
    }

    public static void revert3(char[] chars, int start, int end) {
        while (start < end) {
           char temp = chars[start];
           chars[start++] = chars[end];
           chars[end--] = temp;
        }
    }
}
