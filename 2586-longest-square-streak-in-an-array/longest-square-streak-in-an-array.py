class Solution(object):
    def longestSquareStreak(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums = sorted(set(nums) , reverse =True)
        max_num = max(nums)

        dp= defaultdict(int)

        for num in nums:
            dp[num] = 1
            squared_num =num*num
            if squared_num <= max_num:
                dp[num] += dp[squared_num]

        ans = max(dp.values())

        return ans if ans >= 2 else -1