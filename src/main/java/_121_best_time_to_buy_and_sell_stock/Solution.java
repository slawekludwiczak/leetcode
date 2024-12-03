package _121_best_time_to_buy_and_sell_stock;

/**
 * Maximum subarray problem
 * https://en.wikipedia.org/wiki/Maximum_subarray_problem
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int low = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - low;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (prices[i] < low) {
                low = prices[i];
            }
        }
        return maxProfit;
    }
//    BF
//    public int maxProfit(int[] prices) {
//        if (prices.length <= 1) {
//            return 0;
//        }
//        int max = 0;
//        for (int i = 0; i < prices.length - 1; i++) {
//            for (int j = i; j < prices.length; j++) {
//                int diff = prices[j] - prices[i];
//                if (diff > max) {
//                    max = diff;
//                }
//            }
//        }
//        return max;
//    }
}
