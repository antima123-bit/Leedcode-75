#include <vector>
#include <unordered_set>

class Solution {
public:
    vector<int> findMissingAndRepeatedValues(vector<vector<int>>& grid) {
        int n = grid.size();
        unordered_set<int> seen;

        int repeated = 0, missing = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                int num = grid[i][j];

                if (seen.count(num)) {
                    repeated = num;
                } else {
                    seen.insert(num);
                }
            }
        }

        for (int i = 1; i <= n * n; ++i) {
            if (!seen.count(i)) {
                missing = i;
                break;
            }
        }

        return {repeated, missing};
    }
};