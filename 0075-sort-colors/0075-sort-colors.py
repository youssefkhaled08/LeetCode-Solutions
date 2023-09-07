class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        left = 0
        right = len(nums) - 1
        i = 0
        
        while left <= right and i <= right:
            if nums[i] == 0:
                nums[i] = nums[left]
                nums[left] = 0
                left += 1
                i += 1
            elif nums[i] == 2:
                nums[i] = nums[right]
                nums[right] = 2
                right -= 1
            else:
                i += 1
        return nums
                