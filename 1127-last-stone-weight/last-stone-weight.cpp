class Solution {
public:
    int lastStoneWeight(vector<int>& stones) {
        priority_queue<int> maxHeap(stones.begin(), stones.end());
        
        while (maxHeap.size() > 1) {
            // Get the two heaviest stones
            int stone1 = maxHeap.top();
            maxHeap.pop();
            int stone2 = maxHeap.top();
            maxHeap.pop();
            
            // If they are not the same, push the difference back into the heap
            if (stone1 != stone2) {
                maxHeap.push(stone1 - stone2);
            }
        }
        
        // If there is any stone left, return its weight; otherwise return 0
        return maxHeap.empty() ? 0 : maxHeap.top();
    }
};