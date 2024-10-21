class Solution(object):
    def maxUniqueSplit(self, s):
        """
        :type s: str
        :rtype: int
        """
        seen = set()

        def backtrack(start):
            if start == len(s):
                return 0
            max_splits = 0
            for end in range(start + 1, len(s) + 1):
                substring = s[start:end]
                if substring not in seen:
                    seen.add(substring)
                    max_splits = max(max_splits , 1+backtrack(end))
                    seen.remove(substring)
            return max_splits
        return backtrack(0)
                  