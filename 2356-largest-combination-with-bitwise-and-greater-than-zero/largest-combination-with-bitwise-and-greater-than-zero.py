class Solution(object):
    def largestCombination(self, candidates):
        """
        :type candidates: List[int]
        :rtype: int
        """
        bit_count = [0]*24
        for num in candidates:
            for i in range(24):
                if num & (1 << i):
                    bit_count[i] += 1

        return max(bit_count)