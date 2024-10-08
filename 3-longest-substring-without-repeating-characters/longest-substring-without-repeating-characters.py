class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        char_index ={}
        max_length = 0 
        left = 0

        for right in range(len(s)):
            if s[right] in char_index:

               left = max(left, char_index[s[right]] + 1)
            char_index[s[right]] = right

            
            max_length =max(max_length, right-left+1)
        return max_length    