public class LeetCode122 {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            result = Math.max(prices[i] - prices[i - 1], 0) + result;
        }
        return result;
    }
}
