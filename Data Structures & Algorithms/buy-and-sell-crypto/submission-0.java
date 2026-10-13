class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit =0;
        int minPrice = prices[0];
        for(int i=0; i<prices.length; i++){
             int profit = prices[i] - minPrice;
             minPrice = Math.min(minPrice, prices[i]);
             maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}
