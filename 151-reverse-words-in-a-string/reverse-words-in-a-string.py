class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """

        words = s.split()
        reverse_words= words[::-1]
        result=' '.join(reverse_words)

        return result
       