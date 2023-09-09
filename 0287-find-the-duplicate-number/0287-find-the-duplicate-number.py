class Solution(object):
    def findDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        uniques = set()
        for num in nums:
            if num in uniques:
                return num
            uniques.add(num)
        return -1