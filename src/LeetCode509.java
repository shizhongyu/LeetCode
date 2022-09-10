public class LeetCode509 {
    public static void main(String[] args) {
        System.out.println(fib(2));
    }

    /**
     * 动态规划
     * @param n
     * @return
     */
    public static int fib(int n) {
        if (n < 2) {
            return n;
        }
        int[] dp = {0, 1};
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = sum;
        }
        return sum;
    }
}
