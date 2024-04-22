class Solution(object):
    def reverseWords(self, s):
     words = s.split()
     reversed_words = ' '.join(reversed(words))
     return reversed_words