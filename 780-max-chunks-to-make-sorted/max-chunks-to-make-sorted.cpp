class Solution {
public:
    int maxChunksToSorted(vector<int>& arr) {
        int a = 0, cnt = 0;
        for (int i = 0; i < arr.size(); i++) {
            a += arr[i];
            a -= i;
            cnt += a == 0;
        }
        return cnt;
    }
};