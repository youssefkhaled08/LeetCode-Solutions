class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        answer = []
        counts = {}
        sortedNums = sorted(nums)
        
        for i, num in enumerate(sortedNums):
            if num not in counts:
                counts[num] = i
            
        for num in nums:
            answer.append(counts[num])
        
        return answer