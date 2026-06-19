class Solution {
    public int maxProfit(int[] prices) {
        int minVal = Integer.MAX_VALUE;
        int profit = 0;

        for(int i=0; i<prices.length; i++){
            profit = Math.max(profit, prices[i] - minVal);
            minVal = Math.min(minVal, prices[i]);
        }
        return profit;
    }
}
