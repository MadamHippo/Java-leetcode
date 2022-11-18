/*
 Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

Example:
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]



 Space O(1) time O(n)
        
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
    public ListNode removeElements(ListNode head, int val) {
        // initalize dummy node to before head node
        ListNode dummy_head = new ListNode();
        
        // prev pointer = dummy node
        ListNode prev_pointer = dummy_head;
        
        // current pointer = actual head of linked list
        ListNode current = head;
        
    
        dummy_head.next = current;
                
        // while current isn't none:
        while (current != null) {
            // save next pointer (current.next) so you will have something to point to later when you need to delete a target node.
            ListNode temp = current.next;
            // now if current's value is == to target value then we delete it by...
            if (current.val == val){
                // moving prev's next pointer to current's next pointer (skipping current since it will be deleted)
                // basically we're deleting current.val...
                
                prev_pointer.next = current.next; // <- @ HIPPO...you can also put temp here instead of current.next...but I wonder what the ramifications are. 
                
        // else if current doesn't equal target value...
            } else {
                // just move prev's pointer to the next node like normal.
                prev_pointer = prev_pointer.next;     
            }
            // ALWAYS move current to current.next no matter what so we can finish the while loop condition
            current = current.next;
        
        }

        // return the entire linked list, we have to return the head...
        return dummy_head.next;

    } 
}
