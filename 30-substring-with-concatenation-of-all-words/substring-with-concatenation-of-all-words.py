class Solution(object):
    def findSubstring(self, s, words):
        """
        :type s: str
        :type words: List[str]
        :rtype: List[int]
        """
        # all string words the same length
        ret = []
        n = len(s)
        k = len(words)
        m = len(words[0])
        p = m * k # total len of words
        initWindow = []
        notValid = set()
        valid = set()

        if n < p:
            # dont have enough words
            return []
            
        def validSubtring(substring):
            tempWords = words[:]
            i = 0
            while i < p:
                currWord = substring[i: i + m]
                if currWord in tempWords:
                    tempWords.remove(currWord)
                i += m
            
            return tempWords == []

        for i in range(p):
            letter = s[i]
            initWindow.append(letter)

        if validSubtring("".join(initWindow)):
            ret.append(0)

        i = p
        
        while i < n:
            letter = s[i]
            initWindow.pop(0)
            initWindow.append(letter)
            tempString = "".join(initWindow)
            # use caching here so no need to travsert again
            if tempString not in notValid:
                if tempString in valid or validSubtring(tempString):
                    ret.append(i - p + 1)
                    valid.add(tempString)
                else:
                    notValid.add(tempString)

            i += 1
        
        return ret