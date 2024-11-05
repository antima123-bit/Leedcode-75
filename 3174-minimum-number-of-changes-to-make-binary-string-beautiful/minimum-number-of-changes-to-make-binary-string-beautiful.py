class Solution(object):
    def minChanges(self, s):
        """
        :type s: str
        :rtype: int
        """
        changes = 0  # Yeh variable count karega ki kitne changes chahiye
        for i in range(0, len(s), 2):  # Har 2 characters par loop chalate hain
            if s[i] != s[i + 1]:  # Agar consecutive characters different hain
                changes += 1  # Toh ek change karna padega taake dono same ho jayein
        return changes  # Total changes ko return karte hain
