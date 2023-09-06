class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        index1 = 0
        index2 = 1
        
        while index1 < len(nums):
            if nums[index1] +  nums[index2] == target:
                break
            else:
                index2 += 1
            
            if index2 == len(nums):
                index1 += 1
                index2 = index1 + 1
        
        return [index1, index2]