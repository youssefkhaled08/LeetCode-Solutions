class Solution(object):
    def findDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        for num in nums:
            current = abs(num)
            if nums[current] < 0:
                duplicate = current
                break
            nums[current] *= -1
            
        for i in range(len(nums)):
            nums[i] = abs(nums[i])
            
        return duplicate