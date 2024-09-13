class Solution {
    public int removeElement(int[] nums, int val) {
         int k = 0;  // Pointer to track the next position of valid elements
        
        // Traverse through all elements in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val, keep it
            if (nums[i] != val) {
                nums[k] = nums[i];  // Place the element at the k-th position
                k++;  // Increment k
            }
        }
        return k;
    }
}