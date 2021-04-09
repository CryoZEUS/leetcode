/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode p1 = headA;
        ListNode p2 = headB;
        
        // Edge case :
        if(headA == null || headB == null) return null;
        
        
        while(p1!=null && p2!=null && p1!=p2) {
            p1 = p1.next;
            p2 = p2.next;
            
            //if they collide or reach end without colliding,
            //return one of the pointers
            if(p1 == p2) return p1;
            
            //if one of them reaches earlier, move it to the head of the other node.
            //same process for other pointer.
            //this way, they both travel equal length, which is len(listA)+len(listB)+len(till_intersection)
            if(p1 == null) {
                p1 = headB;
            }
            if(p2 == null) {
                p2 = headA;
            }
        }
        return p1;
        
        
    }
}