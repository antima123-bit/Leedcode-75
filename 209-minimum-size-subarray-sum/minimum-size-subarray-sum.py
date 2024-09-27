class Solution:
    def minSubArrayLen(self, target, nums):
        current_sum = 0
        min_length = float('inf')  # Start with infinity
        start = 0  # Start pointer

        for end in range(len(nums)):
            current_sum += nums[end]  # Add the current number to the current sum

            while current_sum >= target:  # While the sum is at least the target
                min_length = min(min_length, end - start + 1)  # Update the min_length
                current_sum -= nums[start]  # Shrink the window from the left
                start += 1  # Move start to the right

        return min_length if min_length != float('inf') else 0  # Return result
