class Solution {
    public int maxProfit(int[] prices) {
        int buyprices = Integer.MAX_VALUE;
        int maxprofit = 0 ; 
        for(int i=0 ; i< prices.length ; i++){
            if(buyprices < prices[i]){
                int profit = prices[i] - buyprices ;
                maxprofit = Math.max(maxprofit , profit);
            }
            else{
                buyprices = prices[i] ; 
            }
        }
        return maxprofit;
    }
}