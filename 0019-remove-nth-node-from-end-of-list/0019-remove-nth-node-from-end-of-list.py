# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        dummy = ListNode(0,head)
        walker = dummy
        runner = head
        
        for i in range(n):
            runner = runner.next
        
        while runner:
            walker = walker.next
            runner = runner.next
        
        walker.next = walker.next.next
        
        return dummy.next