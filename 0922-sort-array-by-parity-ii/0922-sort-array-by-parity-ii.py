class Solution(object):
    def sortArrayByParityII(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        evenPtr = 0
        oddPtr = 1
        
        n = len(nums)
        
        while evenPtr < n and oddPtr < n:
            while evenPtr < n and nums[evenPtr] % 2 == 0:
                evenPtr += 2
            while oddPtr < n and nums[oddPtr] % 2 != 0:
                oddPtr += 2
            if evenPtr < n and oddPtr < n:
                temp = nums[evenPtr]
                nums[evenPtr] = nums[oddPtr]
                nums[oddPtr] = temp
            
        return nums
            