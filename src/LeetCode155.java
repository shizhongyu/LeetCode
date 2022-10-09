import java.util.Stack;

public class LeetCode155 {
       static MinStack minStack = new MinStack();
    public static void main(String[] args) {
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin(); // return -3
        minStack.pop();
        minStack.top();    // return 0
        minStack.getMin(); // return -2
    }

    public static class MinStack {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();
        public MinStack() {

        }

        public void push(int val) {
            stack.push(val);
            int minValue = minStack.isEmpty() ? val : Math.min(val, minStack.peek());
            minStack.push(minValue);
        }

        public void pop() {
            minStack.pop();
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }
}
