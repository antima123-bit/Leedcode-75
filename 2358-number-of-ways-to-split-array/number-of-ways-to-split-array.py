class Solution:
    def waysToSplitArray(self, nums: List[int]) -> int:
        if not nums:
            return 0
        n= len(nums)
        count= 0
        left_sum=0
        total_sum= sum(nums)

        for i in range(n-1):
            left_sum += nums[i]
            right_sum = total_sum - left_sum
            if left_sum >= right_sum:
               count+= 1
        return count