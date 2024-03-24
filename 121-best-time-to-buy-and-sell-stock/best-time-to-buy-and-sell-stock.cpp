class Solution {
public:
    int maxProfit(std::vector<int>& prices) {
        int mini=prices[0];
        int profit=0;
        for(int i=1;i<prices.size();i++){
            int diff=prices[i] - mini;
            profit= std::max(profit , diff);
            mini = std::min(mini, prices[i]);
        }
        return profit;
    }
};