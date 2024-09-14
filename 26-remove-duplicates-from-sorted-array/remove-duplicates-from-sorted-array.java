class Solution {
    public int removeDuplicates(int[] nums) {
         if (nums.length == 0) return 0;

        // Initialize k to 0 since the first element is always unique
        int k = 0;

        // Start iterating from the second element
        for (int i = 1; i < nums.length; i++) {
            // Check if the current element is different from the previous one
            if (nums[i] != nums[k]) {
                // Increment k and move the unique element to position k
                k++;
                nums[k] = nums[i];
            }
        }
        
        // k is zero-based, so we return k + 1 as the count of unique elements
        return k + 1;
    }
}