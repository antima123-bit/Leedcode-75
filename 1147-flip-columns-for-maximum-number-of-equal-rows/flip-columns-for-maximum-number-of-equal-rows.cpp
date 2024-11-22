class Solution {
public:
    int maxEqualRowsAfterFlips(vector<vector<int>>& matrix) {
        unordered_map<string,int> patternCount;
        int maxCount = 0;
        for(auto &row : matrix){
            string original =" " , flipped = " " ;
            for (int val : row){
                original += to_string(val);
                flipped += to_string(1-val);
            }
            patternCount[original]++;
            patternCount[flipped]++ ;
            maxCount  = max(maxCount , max(patternCount[original] ,patternCount[flipped]));
        }
        return maxCount;
    }
};