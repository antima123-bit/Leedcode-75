class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = n - 2; // Start from the second-to-last element

        // Step 1: Find the pivot
        while (pivot >= 0 && nums[pivot] >= nums[pivot + 1])
            pivot--;

        if (pivot >= 0) {
            // Step 2: Find the rightmost successor
            int successor = n - 1;
            while (nums[successor] <= nums[pivot])
                successor--;

            // Step 3: Swap the pivot and successor
            swap(nums, pivot, successor);
        }

        // Step 4: Reverse the suffix
        reverse(nums, pivot + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
