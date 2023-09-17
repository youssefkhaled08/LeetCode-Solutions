class Solution(object):
    def findSubstring(self, s, words):
        """
        :type s: str
        :type words: List[str]
        :rtype: List[int]
        """
        if len(s) == 0 or s is None or words is None:
            return[]
        
        freq = {}
        wordLen = len(words[0])
        wordsLen = len(words)
        window = wordLen * wordsLen
        indicies = []
        
        for word in words:
            freq[word] = 1 + freq.get(word, 0)
            
        for left in range(len(s) - window + 1):
            count = {}
            
            for right in range(wordsLen):
                wordIndex = left + right * wordLen
                word = s[wordIndex: wordIndex + wordLen]
                
                if word not in freq:
                    break
                    
                count[word] = 1 + count.get(word, 0)
                
                if count[word] > freq[word]:
                    break
            if count == freq:
                indicies.append(left)
        
        return indicies