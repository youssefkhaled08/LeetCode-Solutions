import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head, previousNode, currentNode;
        
        // Get to the middle node.
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Set up for reversing
        previousNode = slow;
        slow = slow.next;
        previousNode.next = null;

        // Reversing.
        while(slow != null){
            currentNode = slow.next;
            slow.next = previousNode;
            previousNode = slow;
            slow = currentNode;
        }
        fast = head;
        slow = previousNode;
        // Comparsion
        while(slow != null){
            if(slow.val != fast.val)
                return false;
            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }
}
// @lc code=end

