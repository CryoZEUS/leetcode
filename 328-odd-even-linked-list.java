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
    public ListNode oddEvenList(ListNode head) {
        
        ///Edge case:
        if(head == null || head.next == null) return head;
            
        //Pointers
        /*
        * second stays on head.next always to link back at the end
        * curr always stays ahead of prev, advances one step
        * prev links current element it is on to next to next (both for even and odd) 
        * count maintains number of elements in LinkedList
        */
        ListNode second = head.next;
        ListNode curr = head.next;
        ListNode prev = head;
        int count = 0;
        
        while(curr.next != null && prev.next.next != null) {
            prev.next = prev.next.next;
            //curr advances 1 step
            prev = curr;
            curr = curr.next;
            count++;
            
        }
        //If loop runs even times i.e even elements in the LinkedList
        if((curr.next == null || prev.next.next == null) && count%2 == 0) {
            prev.next = second;
            curr.next = null;
        }
        //If loop runs odd times i.e odd elements in the LinkedList
        if((curr.next == null || prev.next.next == null) && count%2 == 1) {
            prev.next = null;
            curr.next = second;
        }
        
        
        return head;
    }
}