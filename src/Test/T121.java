package Test;

public class T121 {
    public int maxProfit(int[] prices) {
        int result = Integer.MIN_VALUE;
        int low = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            low = Math.min(low, prices[i]);
            result = Math.max(result, prices[i] - low);
        }
        return result;
    }
}
