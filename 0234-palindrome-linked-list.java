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
        
        //Edge cases
        if(head == null || head.next == null) return true;
        
        //Init pointers
        ListNode fast = head;
        ListNode slow = head;
        
        //traverse through the LL till fast reaches the end.
        //this way, slow will  be at the middle of the list.
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        //for odd nodes:
        if(fast!= null) {slow = slow.next;}
        //slow becomes start of second half and fast becomes start of first half
        slow = reverse(slow);
        fast = head;
        
        while(slow != null) {
            
            if(fast.val != slow.val) return false;
            
            fast = fast.next;
            slow = slow.next;
                
        }
        return true;
        
    }
    
    //Write a separate reverse function:
    public ListNode reverse(ListNode head) {
        
        ListNode prev = null;
        
        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}