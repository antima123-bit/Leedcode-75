#include <string>
#include <vector>

class Solution {
public:
    std::string longestPalindrome(std::string s) {
        std::string ans;
        int maxlength = 0;
        int n = s.size();
        std::vector<std::vector<int>> dp(n, std::vector<int>(n, 0));
        for (int diff = 0; diff < n; diff++) {
            for (int i = 0, j = i + diff; j < n; i++, j++) {
                if (i == j) {
                    dp[i][j] = 1;
                } else if (diff == 1) {
                    dp[i][j] = (s[i] == s[j]) ? 2 : 0;
                } else {
                    if (s[i] == s[j] && dp[i+1][j-1] != 0) {
                        dp[i][j] = dp[i+1][j-1] + 2;
                    }
                }
                if (dp[i][j]) {
                    if (j - i + 1 > maxlength) {
                        maxlength = j - i + 1;
                        ans = s.substr(i, maxlength);
                    }
                }
            }
        }
        return ans;
    }
};
