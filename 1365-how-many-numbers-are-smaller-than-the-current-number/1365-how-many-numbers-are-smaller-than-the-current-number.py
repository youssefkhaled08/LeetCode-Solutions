class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        count = 0
        current = 0
        faster = 1
        answer = [0 for _ in range(len(nums))]
        
        while current < len(nums):
            if nums[current] > nums[faster]:
                answer[current] += 1
            faster += 1
            if faster == len(nums):
                current += 1
                faster = 0
        return answer