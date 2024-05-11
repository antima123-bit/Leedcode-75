class Solution(object):
    def maxVowels(self, s, k):
        """
        :type s: str
        :type k: int
        :rt
        ype: int
        """
        vowels = set('aeiou')
        max_vowels = 0
        curr_vowels = sum(1 for char in s[:k] if char in vowels)

        max_vowels = curr_vowels

        for i in range(k,  len(s)):
            if s[i-k] in vowels:
                curr_vowels -= 1
            if s[i] in vowels:
                curr_vowels += 1
            max_vowels = max(max_vowels, curr_vowels)

        return max_vowels
        