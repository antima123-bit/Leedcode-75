class Solution {
 public:
  int findTargetSumWays(vector<int>& n, int tar) {
    const int sum = accumulate(n.begin(), n.end(), 0);
    if (sum < abs(tar) || (sum + tar) % 2 == 1)
      return 0;
    return knapsack(n, (sum + tar) / 2);
  }

 private:
  int knapsack(const vector<int>& n, int tar) {
    const int u= n.size();
    vector<vector<int>> dp(u + 1, vector<int>(tar + 1));
    dp[0][0] = 1;

    for (int i = 1; i <= u; ++i) {
      const int num = n[i - 1];
      for (int j = 0; j <= tar; ++j)
        if (j < num)
          dp[i][j] = dp[i - 1][j];
        else
          dp[i][j] = dp[i - 1][j] + dp[i - 1][j - num];
    }

    return dp[u][tar];
  }
};