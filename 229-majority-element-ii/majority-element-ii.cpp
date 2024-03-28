#include <vector>

using namespace std;

class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        // Initialize variables to track potential candidates and their counts
        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;

        // Step 1: Find potential candidates for majority elements
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Step 2: Count the occurrences of potential candidates
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        // Step 3: Check if potential candidates occur more than n/3 times
        vector<int> result;
        if (count1 > nums.size() / 3) {
            result.push_back(candidate1);
        }
        if (count2 > nums.size() / 3) {
            result.push_back(candidate2);
        }

        return result;
    }
};
