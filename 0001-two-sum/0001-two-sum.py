class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        indicies = {}
        for i in range(len(nums)):
            numToFind = target - nums[i]
            if numToFind in indicies:
                return [i, indicies[numToFind]]
            indicies[nums[i]] = i
            