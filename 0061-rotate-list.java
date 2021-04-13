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
    public ListNode rotateRight(ListNode head, int k) {
		
        //Edge Cases
        if(head == null || head.next == null) return head;

		int length = 0;
		ListNode p = head;
        
        //Loop to find length
		while(p != null){
			p = p.next;
			length++;
		}
        
        // for k > length
		k = k % length;
        
        if(k == 0) return head;

		ListNode fpart, lpart;
		lpart = head;
        
        //find last node of first part
		for(int i = 1; i < length - k; i++){
			head = head.next;
		}

		fpart = head.next;
		head.next = null;

		if(fpart == null) return lpart;
        
		p = fpart;
        
        //joining split lists
		while(p.next != null){
			p = p.next;
		}
        
		p.next = lpart;

		return fpart;
	}
}