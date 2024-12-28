

class Solution {
public:
    vector<int> maxSumOfThreeSubarrays(vector<int>& nums, int k) {
        int n = nums.size();
        vector<int> sum(n + 1, 0);
        for (int i = 0; i < n; ++i) {
            sum[i + 1] = sum[i] + nums[i];
        }

        vector<int> left(n, 0), right(n, n - k);
        for (int i = k, total = sum[k] - sum[0]; i < n; ++i) {
            if (sum[i + 1] - sum[i + 1 - k] > total) {
                left[i] = i + 1 - k;
                total = sum[i + 1] - sum[i + 1 - k];
            } else {
                left[i] = left[i - 1];
            }
        }

        for (int i = n - k - 1, total = sum[n] - sum[n - k]; i >= 0; --i) {
            if (sum[i + k] - sum[i] >= total) {
                right[i] = i;
                total = sum[i + k] - sum[i];
            } else {
                right[i] = right[i + 1];
            }
        }

        vector<int> result = {-1, -1, -1};
        for (int i = k; i <= n - 2 * k; ++i) {
            int l = left[i - 1], r = right[i + k];
            if (result[0] == -1 || sum[l + k] - sum[l] + sum[i + k] - sum[i] + sum[r + k] - sum[r] > 
                sum[result[0] + k] - sum[result[0]] + sum[result[1] + k] - sum[result[1]] + sum[result[2] + k] - sum[result[2]]) {
                result = {l, i, r};
            }
        }

        return result;
    }
};
