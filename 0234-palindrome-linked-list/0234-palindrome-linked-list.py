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
        slow = fast = head
        # Getting (slow) to the middle of the linked list.
        while fast and fast.next:
            slow = slow.next 
            fast = fast.next.next
            
        # Reversing the second half of the linked list.
        previous = slow
        slow = slow.next
        previous.next = None
        
        while slow:
            temp = slow.next
            slow.next = previous
            previous = slow
            slow = temp
        
        # Checking if palindrome
        fast = head
        slow = previous
        
        while slow:
            if slow.val != fast.val:
                return False
            slow = slow.next
            fast = fast.next
        
        return True
        
            
        