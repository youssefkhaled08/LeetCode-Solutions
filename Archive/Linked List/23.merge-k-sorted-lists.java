import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=23 lang=java
 *
 * [23] Merge k Sorted Lists
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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists==null || lists.length == 0)
            return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode n1, ListNode n2){
                if(n1.val < n2.val)
                    return -1;
                else if(n1.val == n2.val)
                    return 0;
                else
                    return 1;
            }
        });

        ListNode mergedHead = new ListNode(0);
        ListNode tail = mergedHead;

        for(ListNode node: lists)
            if(node != null)
                pq.add(node);

        while(!pq.isEmpty()){
            tail.next = pq.poll();
            tail = tail.next;

            if(tail.next != null)
                pq.add(tail.next);
        }

        return mergedHead.next;
    }
}
// @lc code=end

