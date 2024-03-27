#include <vector>

class Solution {
public:
    int numSubarrayProductLessThanK(std::vector<int>& nums, int k) {
        if (k <= 1) return 0; // Since k is greater than 0, if k <= 1, no subarray will satisfy the condition
        
        int count = 0;
        int product = 1;
        int left = 0;
        
        for (int right = 0; right < nums.size(); right++) {
            product *= nums[right];
            
            // Shrink the window from the left until the product is less than k
            while (product >= k) {
                product /= nums[left];
                left++;
            }
            
            // At this point, all subarrays ending at "right" have product less than k
            // Add the count of subarrays to the total count
            count += right - left + 1;
        }
        
        return count;
    }
};
