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
        
        // Edge case
        if(head == null) return head;
        
        // New node linking to head
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        
        //pointers
        ListNode prev = preHead;
        ListNode curr = head;
        
        while(curr != null) {
            
            if(curr.val == val) {
                prev.next = curr.next;
            }
            else {
                prev = prev.next;
            }
            
            curr = curr.next;
        }
        return preHead.next;
    }
}