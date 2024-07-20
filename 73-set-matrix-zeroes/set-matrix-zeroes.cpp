class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        int n = matrix.size();
        int m = matrix[0].size();
        vector<bool> markRow(n, false);
        vector<bool> markCol(m, false);
        
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(matrix[i][j] == 0){
                    markRow[i] = true;
                    markCol[j] = true;
                }
            }
        }
        
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(markRow[i] || markCol[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
};