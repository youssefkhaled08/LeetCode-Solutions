# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeElements(self, head, val):
        """
        :type head: ListNode
        :type val: int
        :rtype: ListNode
        """
        dummy = ListNode(0,head)
        current = head
        previous = dummy
        
        while current:
            if current.val == val:
                previous.next = current.next
            else:
                previous = previous.next
            current = current.next
        return dummy.next