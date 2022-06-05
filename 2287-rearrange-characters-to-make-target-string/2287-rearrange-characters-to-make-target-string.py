class Solution(object):
    def rearrangeCharacters(self, s, target):
        """
        :type s: str
        :type target: str
        :rtype: int
        """
        targetReps = dict()
        for ch in target:
            if ch not in targetReps:
                targetReps[ch] = 0
            targetReps[ch] += 1
        
        strReps = dict()
        for ch in s:
            if ch not in strReps:
                strReps[ch] = 0
            strReps[ch] += 1
        
        maxCopies = sys.maxsize
        
        for ch in targetReps:
            if ch not in strReps or strReps[ch] < targetReps[ch]:
                return 0
            maxCopies = min(maxCopies, strReps[ch]//targetReps[ch])
        
        return maxCopies
        
            