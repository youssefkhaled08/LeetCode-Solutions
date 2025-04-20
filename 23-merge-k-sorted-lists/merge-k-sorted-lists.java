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
        if (lists == null || lists.length == 0)
            return null;
        
        ListNode mergedList = lists[0];

        for(int i = 1; i < lists.length; i++){
            mergedList = mergeTwoLists(mergedList, lists[i]);
        }

        return mergedList;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         ListNode sortedList = new ListNode();
         ListNode current = sortedList;
 
         while (list1 != null && list2 != null){
             if (list1.val <= list2.val){
                 current.next = list1;
                 list1 = list1.next;
             } else {
                 current.next = list2;
                 list2 = list2.next;
             }
 
             current = current.next;
         }
 
         
         if (list1 != null){
             current.next = list1;
         }
         
         if (list2 != null){
             current.next = list2;
         }
 
         return sortedList.next;
 
     }
}