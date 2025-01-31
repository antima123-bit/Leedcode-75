class Solution {
    public int splitArray(int[] nums, int k) {
        int left = getMax(nums);
        int right = getSum(nums);
        
        while (left < right) {
            int mid = left + (right - left) / 2; // Corrected mid calculation
            if (canSplit(nums, k, mid)) {
                right = mid;  // Try a smaller max sum
            } else {
                left = mid + 1; // Increase the sum limit
            }
        }
        return left; // The smallest possible largest sum
    }

    private boolean canSplit(int[] nums, int k, int maxSum) {
        int subarrays = 1, sum = 0;
        for (int num : nums) {
            if (sum + num > maxSum) {
                subarrays++; // Start a new subarray
                sum = num; // Reset sum to current number
                if (subarrays > k) return false; // More subarrays than allowed
            } else {
                sum += num; // Keep adding to the current subarray
            }
        }
        return true; // We managed to split within `k` subarrays
    }

    private int getMax(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }

    private int getSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
