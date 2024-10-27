class Solution {
public:
    int lengthAfterTransformations(string s, int k) {
        const int MOD=1e9+7;
        vector<int> hash(26, 0);

    for (char ch : s) {
        hash[ch - 'a']++;
    }

    for (int i = 0; i < k; ++i) {
        vector<int> new_count(26, 0);


        for (int j = 0; j < 25; ++j) {
            new_count[j + 1] = hash[j];
        }

    
        new_count[0] = hash[25];
        new_count[1] = (new_count[1] + hash[25]) % MOD;

        hash = new_count; 
    }


    long long res = 0;
    for (int num : hash) {
        res = (res + num) % MOD;
    }
    return res;
    }
};