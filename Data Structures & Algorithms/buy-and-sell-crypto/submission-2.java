class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1){
            return 0;
        }
        int L = 0, R = 1;
        int mp = 0;
        while(R < prices.length){
            if(prices[L] > prices[R]){
                L = R;
            } else {
                int profit = prices[R] - prices[L];
                if(mp<profit){
                    mp = profit;
                }
            }
            R++;
        }
        return mp;
    }
}
