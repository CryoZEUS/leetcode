/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        //Edge case
        if(head == null) return head;
        
        //create pointer
        Node iter = head, next;
        
        //First pass - copy each node, 
        //link them side by side in singly linked list
        while(iter != null) {
            next = iter.next;
            
            Node copy = new Node(iter.val);
            iter.next = copy;
            copy.next = next;
            iter = next;
        }
        
        //Second pass - assign random pointers for copies
        iter = head;
        while(iter != null) {
            if(iter.random != null) iter.next.random = iter.random.next;
            iter = iter.next.next;
        }
        
        //Third pass - restore original list, extract copy
        iter = head;
        Node dummyHead = new Node(0);
        Node copy, copyIter = dummyHead;
        
        while(iter != null) {
            next = iter.next.next;
            
            //extract copy :
            copy = iter.next;
            copyIter.next = copy;
            copyIter = copy;
            
            //restore original list :
            iter.next = next;
            iter = next;
        }
        
        return dummyHead.next;
    }
}