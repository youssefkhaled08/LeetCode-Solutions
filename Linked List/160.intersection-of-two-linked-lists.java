/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        ListNode currB = headB;

        while(currA != currB){
            if(currA == null)
                currA = headB;
            else
                currA = currA.next;
            if(currB == null)
                currB = headA;
            else
                currB = currB.next;
        }
        
        return currA;
    }
}
// @lc code=end

