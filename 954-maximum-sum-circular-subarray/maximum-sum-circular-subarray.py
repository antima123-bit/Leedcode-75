class Solution(object):
    def maxSubarraySumCircular(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        def kadane(nums):
            current_sum = nums[0]
            max_sum= nums[0]
            for i in range(1 , len(nums)):
                current_sum = max(nums[i] , current_sum + nums[i])
                max_sum = max(max_sum , current_sum)
            return max_sum

        max_kadane = kadane(nums)

        total_sum = sum(nums)
        nums_inverted = [-num for num in nums]
        max_inverted_kadane = kadane(nums_inverted)
        max_circular = total_sum + max_inverted_kadane

        if max_circular == 0:
            return max_kadane

        return max(max_kadane , max_circular)
