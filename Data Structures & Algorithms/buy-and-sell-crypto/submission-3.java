class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2) return 0;
        
        int max_profit = 0;
        int L=0, R=1;

        while(R < prices.length){
            if(prices[L] > prices[R]){
                L = R;
            } else {
                int profit = prices[R] - prices[L];
                max_profit = max_profit < profit ? profit : max_profit;
            }
            R++;
        }
        return max_profit;
    }
}
