class Solution:
    def wordSubsets(self,words1, words2):
        def count(word):
            return Counter(word)
    
    # Create a maximum frequency counter for words2
        max_freq = Counter()
        for word in words2:
            word_freq = count(word)
            for char in word_freq:
                max_freq[char] = max(max_freq[char], word_freq[char])
    
    # Find universal strings in words1
        universal_strings = []
        for word in words1:
            word_freq = count(word)
            if all(word_freq[char] >= max_freq[char] for char in max_freq):
               universal_strings.append(word)
    
        return universal_strings

