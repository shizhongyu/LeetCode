public class LeetCode70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n) {
        if(n <= 2) {
            return n;
        }

        int[] dp = {1, 2};
        int sum = 0;
        for (int i = 2; i < n; i++) {
            sum = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = sum;
        }
        return sum;
    }
}
