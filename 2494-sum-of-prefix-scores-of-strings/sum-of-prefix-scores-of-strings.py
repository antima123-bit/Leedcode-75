class TrieNode:
    def __init__(self):
        self.children = {}  # A dictionary to hold children TrieNodes
        self.count = 0  # A counter for prefixes

class Solution:
    def sumPrefixScores(self, words):
        root = TrieNode()

        def insert(word):
            node = root
            for c in word:
                node = node.children.setdefault(c, TrieNode())
                node.count += 1

        for word in words:
            insert(word)

        def getScore(word):
            node = root
            score = 0
            for c in word:
                node = node.children[c]
                score += node.count
            return score

        return [getScore(word) for word in words]
