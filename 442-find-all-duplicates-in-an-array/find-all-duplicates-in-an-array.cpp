#include <vector>
#include <cmath> // for abs()

class Solution {
public:
    std::vector<int> findDuplicates(std::vector<int>& nums) {
        std::vector<int> result;
        
        for (int i = 0; i < nums.size(); ++i) {
            int index = std::abs(nums[i]) - 1; // Get the index (1-based)
            if (nums[index] < 0) {
                result.push_back(index + 1); // If the value at index is negative, it means we have encountered it before
            } else {
                nums[index] = -nums[index]; // Negate the value to mark its presence
            }
        }
        
        return result;
    }
};
