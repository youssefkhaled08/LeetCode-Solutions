class Solution(object):
    def partitionLabels(self, s):
        """
        :type s: str
        :rtype: List[int]
        """
        lastOccur = {c: i for i, c in enumerate(s)}
        answer = []
        j = k = 0
        for i, c in enumerate(s):
            j = max(j, lastOccur[c])
            if i == j:
                answer.append(i - k + 1)
                k = i + 1
  
        return answer