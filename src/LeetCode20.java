import java.util.Stack;

public class LeetCode20 {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                stack.push(')');
            }else if(ch == '{') {
                stack.push('}');
            }else if(ch == '[') {
                stack.push(']');
            }else if(!stack.isEmpty() && ch == stack.peek()) {
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
