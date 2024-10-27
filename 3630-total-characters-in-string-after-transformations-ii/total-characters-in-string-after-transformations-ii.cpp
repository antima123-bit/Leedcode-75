class Solution { 
public: 
    const int MOD = 1e9 + 7; 
 
    vector<vector<long long>> matrixMultiply(const vector<vector<long long>>& A, const vector<vector<long long>>& B) { 
        int size = A.size(); 
        vector<vector<long long>> C(size, vector<long long>(size, 0)); 
        for (int i = 0; i < size; i++) { 
            for (int j = 0; j < size; j++) { 
                for (int k = 0; k < size; k++) { 
                    C[i][j] = (C[i][j] + A[i][k] * B[k][j]) % MOD; 
                } 
            } 
        } 
        return C; 
    } 
 
    vector<vector<long long>> matrixExponentiation(vector<vector<long long>>& M, int exp) { 
        int size = M.size(); 
        vector<vector<long long>> result(size, vector<long long>(size, 0)); 
        for (int i = 0; i < size; i++) { 
            result[i][i] = 1; 
        } 
        while (exp > 0) { 
            if (exp % 2 == 1) { 
                result = matrixMultiply(result, M); 
            } 
            M = matrixMultiply(M, M); 
            exp /= 2; 
        } 
        return result; 
    } 
 
    int lengthAfterTransformations(const string& s, int t, vector<int>& nums) { 
        int size = 26; 
        vector<vector<long long>> M(size, vector<long long>(size, 0)); 
        for (int i = 0; i < size; i++) { 
            for (int j = 0; j < nums[i]; j++) { 
                M[i][(i + j + 1) % size] += 1; 
            } 
        } 
        M = matrixExponentiation(M, t); 
        vector<long long> initialCount(size, 0); 
        for (char c : s) { 
            initialCount[c - 'a'] += 1; 
        } 
        vector<long long> resultCount(size, 0); 
        for (int i = 0; i < size; i++) { 
            for (int j = 0; j < size; j++) { 
                resultCount[j] = (resultCount[j] + M[i][j] * initialCount[i]) % MOD; 
            } 
        } 
        long long result = 0; 
        for (long long count : resultCount) { 
            result = (result + count) % MOD; 
        } 
        return result; 
    } 
};