/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * Write a function to delete a node (except the tail) in a singly linked list, 
 * given only access to that node.
 */
public class Solution {
    public void deleteNode(ListNode node) {
        
        int value = node.val;
        ListNode next_node = node.next;
        
        while(next_node != null){
            
          if(next_node != null)
            node.val = next_node.val;
          
          if(next_node.next == null){
              node.next = null;
              next_node = null;
              return;
          }
          
          else{
            node = node.next;
            next_node = node.next;
          }
          
        }
    }
}