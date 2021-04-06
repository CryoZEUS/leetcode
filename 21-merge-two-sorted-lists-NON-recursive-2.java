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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null) return l2;
        if(l2 == null) return l1;

                
        ListNode newHead = new ListNode(-101);
		ListNode previous = newHead;

        ListNode curr1 = l1;
		ListNode curr2 = l2;
    
        while(curr1 != null && curr2 != null){
            
            if(curr1.val <= curr2.val) {
			
            	previous.next = curr1;
				curr1 = curr1.next;
			}

            else {

				previous.next = curr2;
				curr2 = curr2.next;
			}

			previous = previous.next;

		}
        
        if(curr1 != null){
            previous.next = curr1;
        }

        if(curr2 != null){
            previous.next = curr2;
        }


        return newHead.next;
    }
}