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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        //Create a dummy Node that points to the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        //Creaate 2 pointers that have a gap of n
        ListNode first = dummy;
        ListNode second = dummy;
        
        // Advances first pointer so that the gap between first and second is n nodes apart
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        
        
        // Move first to the end, maintaining the gap
        while (first != null) {
            
            first = first.next;
            second = second.next;
        }
        
        second.next = second.next.next;
        
        //Crucial step:
        return dummy.next;
    }
    
}