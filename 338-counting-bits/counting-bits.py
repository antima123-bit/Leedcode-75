class Solution(object):
    def countBits(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        ans = []
        for i in range(n+1):
            ones_count = bin(i).count('1')
            ans.append(ones_count)
        return ans