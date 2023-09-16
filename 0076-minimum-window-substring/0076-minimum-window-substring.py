class Solution(object):
    def minWindow(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        countT = dict()
        for char in t:
            countT[char] = 1 + countT.get(char, 0)
        
        counter = len(countT)
        begin = end = 0
        window = float("inf")
        answer =''
        
        while end < len(s):
            endChar = s[end]
            if endChar in countT:
                countT[endChar] -= 1
                if countT[endChar] == 0:
                    counter -= 1
            end += 1
            
            while counter == 0:
                if end - begin < window:
                    window = end - begin
                    answer = s[begin:end]
                
                startChar = s[begin]
                
                if startChar in countT:
                    countT[startChar] += 1
                    if countT[startChar] > 0:
                        counter += 1
                begin += 1
        return answer