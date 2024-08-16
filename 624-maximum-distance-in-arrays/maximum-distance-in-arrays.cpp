class Solution {
public:
    int maxDistance(vector<vector<int>>& arrays) {
        int min_val = arrays[0][0];
        int max_val = arrays[0][arrays[0].size() - 1];
        int res = 0;
        
        for (int i = 1; i < arrays.size(); i++) {
            res = max(res, max(abs(arrays[i][arrays[i].size() - 1] - min_val), abs(max_val - arrays[i][0])));
            min_val = min(min_val, arrays[i][0]);
            max_val = max(max_val, arrays[i][arrays[i].size() - 1]);
        }
        
        return res;
    }
};