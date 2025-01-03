class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        nums_dict = {} 
        for i , num in enumerate(nums):
            complement = target - num
            if complement in nums_dict:
                return [nums_dict[complement] , i]
            nums_dict[num] = i
        return None
        