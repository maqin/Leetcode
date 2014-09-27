public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1)
            return 0;
        int res = 0;
        int minV = prices[0];
        for(int i = 1; i<prices.length; i++){
            minV = Math.min(minV, prices[i]);
            res = Math.max(res, prices[i]-minV);
        }
        return res;
    }
}
