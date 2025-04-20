/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        
        ListNode slow = head;
        ListNode fast = head;

        // Locate the midpoint of the Linked List.
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the Linked List

        ListNode prev = null;
        ListNode curr = slow;

        while(curr != null){
            ListNode nextTemp = curr.next;  // save next node
            curr.next = prev;               // reverse ptr
            prev = curr;                    // move prev forward
            curr = nextTemp;                // move curr forward
        }


        // Compare halves
        ListNode firstHalf = head;
        ListNode secondHalf = prev;

        while (secondHalf != null){
            if (firstHalf.val != secondHalf.val)
                return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }
}