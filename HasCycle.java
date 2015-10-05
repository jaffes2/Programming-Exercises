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
    public boolean hasCycle(ListNode head) {
        
        if (head == null) 
            return false;
    
        ListNode turtle = head; // moves one node at a time
        ListNode hare = head; // moves two nodes at a time
    
        while (hare.next != null && hare.next.next != null) {
             
             turtle = turtle.next;
             hare = hare.next.next;
    
            // Pointing to the same node, therefore a cycle is detected
             if (turtle == hare) 
                return true;
        }
    
        // No cycle -- list is not circular
        return false;
    }
}