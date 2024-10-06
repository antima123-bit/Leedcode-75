class Solution(object):
    def areSentencesSimilar(self, sentence1, sentence2):
        """
        :type sentence1: str
        :type sentence2: str
        :rtype: bool
        """
        words1 = sentence1.split()
        words2= sentence2.split()

        left = 0 
        right = 0
        while left < len(words1) and left < len(words2) and words1[left] == words2[left]:
            left += 1
        while right < len(words1)- left  and right < len(words2) and words1[-(right+1)] == words2[-(right+1)]:
            right += 1
        return left + right >= min(len(words1), len(words2))