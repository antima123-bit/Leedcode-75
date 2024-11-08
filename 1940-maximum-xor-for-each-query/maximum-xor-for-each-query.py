class Solution(object):
    def getMaximumXor(self, nums, maximumBit):
        """
        :type nums: List[int]
        :type maximumBit: int
        :rtype: List[int]
        """
        max_k = (1 << maximumBit) - 1
        xor_all = 0 
        for num in nums:
            xor_all ^= num
        answer = []
        for i in range(len(nums)):
            k = xor_all ^ max_k
            answer.append(k)

            xor_all ^= nums.pop()
        return answer