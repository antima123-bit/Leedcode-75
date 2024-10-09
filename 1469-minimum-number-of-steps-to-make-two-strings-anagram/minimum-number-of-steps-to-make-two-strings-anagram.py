class Solution(object):
    def minSteps(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: int
        """
        count_s= Counter(s)
        count_t= Counter(t)
        interchange= 0
        for char in count_s:
            if count_s[char] > count_t[char]:
                interchange += count_s[char] - count_t[char]
        return interchange