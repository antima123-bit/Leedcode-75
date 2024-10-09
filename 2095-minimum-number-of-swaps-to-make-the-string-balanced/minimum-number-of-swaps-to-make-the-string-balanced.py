class Solution(object):
    def minSwaps(self, s):
        """
        :type s: str
        :rtype: int
        """
        imbalance = 0
        max_imbalance = 0

        for bracket in s:
            if bracket == '[':
               imbalance -= 1
            else:
               imbalance  += 1

            max_imbalance = max(max_imbalance , imbalance)
        return(max_imbalance + 1) // 2
            