#include <vector>

class Solution {
public:
    void merge(std::vector<int>& nums1, int m, std::vector<int>& nums2, int n) {
        int i = m - 1; // Index for nums1
        int j = n - 1; // Index for nums2
        int k = m + n - 1; // Index for merged array

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If nums2 still has elements left
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
};
