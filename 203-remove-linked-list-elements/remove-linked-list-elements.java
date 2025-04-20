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
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;

        ListNode dummyHead = new ListNode(-1, head);
        ListNode current = dummyHead;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
                continue;
            }
            current = current.next;
        }

        return dummyHead.next;
    }
}