// Last updated: 3/24/2026, 11:30:15 AM
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
    public ListNode detectCycle(ListNode head) {
        ListNode x=head;
        ListNode y=head;
        while(y!=null && y.next!=null){
            x=x.next;
            y=y.next.next;
            
            if (x == y) {
                x = head;
                while (x != y) {
                    x = x.next;
                    y = y.next;
                }
                return x; 
            }
        }
        return null;
    }
}