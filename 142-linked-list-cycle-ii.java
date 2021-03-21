/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        int flag = 0;
        
        
        // Initialize pointers
        ListNode slow = head;
        ListNode fast = head;
        
        while(slow != null && fast != null && fast.next != null) {
            // Fast pointer moves twice as fast
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) {
                flag = 1;
                break;
            }
            
        }
        if(flag == 0) {return null;}
        else {
            // Use a third search pointer which starts at head
            // while slow loops through the Linked List
            ListNode search = head;
            while(search != slow){
                slow = slow.next; search = search.next;
                }
            // return search when search meets slow. i.e circular node connection
            return search;
        }
        
    }
}

