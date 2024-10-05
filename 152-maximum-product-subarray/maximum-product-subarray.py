class Solution(object):
    def maxProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_product = nums[0]
        min_product= nums[0]
        result = nums[0]

        for i in range(1 , len(nums)):
            curr_nums = nums[i]
            temp_max = max(curr_nums , max_product * curr_nums , min_product * curr_nums)
            temp_min = min(curr_nums , max_product * curr_nums , min_product * curr_nums)



            min_product = temp_min
            max_product = temp_max


            result = max(result , max_product)
        return result