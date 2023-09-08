# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        values = []
        ptr = head
        while ptr:
            values.append(ptr.val)
            ptr = ptr.next
            
        left = 0
        right =  len(values) - 1
        
        while left < right:
            if values[left] != values[right]:
                return False
            left += 1
            right -= 1
            
        return True