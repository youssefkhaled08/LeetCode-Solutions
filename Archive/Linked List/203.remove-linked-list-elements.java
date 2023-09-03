/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
 */

// @lc code=start
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
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode currentNode = head;
        ListNode previousNode = dummyHead; 

        while(currentNode != null){
            if(currentNode.val == val){
                previousNode.next = currentNode.next;
            }else{
                previousNode = previousNode.next;
            }

            currentNode = currentNode.next;
        }

        return dummyHead.next;
    }
}
// @lc code=end

