/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        
        // Edge case
        if(head == null) return head;
        
        //Since elements in child layers are added first,
        //Use Stack
        Node iter = head;
        Stack<Node> st = new Stack<>();
        //stores elements on the right when child != null
        
        while(iter != null) {
            
            // Case : Child exists
            if(iter.child != null) {
                //push all elements to the right
                st.add(iter.next);
                //traverse along child
                iter.next = iter.child;
                //fix pointers for doubly linked list
                if(iter.next != null) {
                    iter.next.prev = iter;
                }
                //set child to null, as child is now next
                iter.child = null;
            }
            
            // Case : Child DOES NOT exist and stack is NOT empty
            while(iter.next == null && !st.isEmpty()) {
                //point to the elements on top of the stack
                iter.next = st.pop();
                //remap because doubly linked list
                if(iter.next != null) {
                    iter.next.prev = iter;
                } 
            }
            
            iter = iter.next;
        }
        
        return head;
    }
    
}