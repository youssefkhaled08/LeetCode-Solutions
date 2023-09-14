class Solution(object):
    def findMaxAverage(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: float
        """
        windowSum = 0
        
        for i in range(k):
            windowSum += nums[i]
        
        maxSum = windowSum
        
        for i in range(k, len(nums)):
            windowSum += nums[i] - nums[i-k]
            maxSum = max(maxSum, windowSum)
            
        
        return (float(maxSum) / k)