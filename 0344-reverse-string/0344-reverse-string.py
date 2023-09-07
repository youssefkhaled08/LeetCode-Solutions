class Solution(object):
    def reverseString(self, s):
        """
        :type s: List[str]
        :rtype: None Do not return anything, modify s in-place instead.
        """
        left = 0
        right = len(s) - 1
        
        while left < right:
            temp = s[right]
            s[right] = s[left]
            s[left] = temp
            
            right -= 1
            left += 1
            
        return s