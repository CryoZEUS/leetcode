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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        //LOGIC OS FINE. GETTING NULL POINTER EXCEPTION
        
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        int temp = 0;
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode extra = new ListNode(1);
        

        
        while(p1 != null || p2 !=  null) {
            
            temp = p1.val + p2.val;
            
            if(temp < 10) {
                p1.val = temp;
            }
            
            else {
                
                p1.val = temp%10;
                
                if(p1.next != null && p2.next == null) {
                    p2.next = p1.next;
                    p1.next.val = (p1.next.val + 1) / 2;    
                }
                if(p1.next == null && p2.next != null) {
                    p1.next = p2.next;
                    p2.next.val = (p2.next.val + 1) / 2;
                }
                if(p1.next == null && p2.next == null) {
                    p1.next = extra;
                    extra.next = null;
                }
                else {
                    ++p1.next.val;
                }
                
                
            }
            
            p1 = p1.next;
            p2 = p2.next;
        }
        return l1;
        
    }
}