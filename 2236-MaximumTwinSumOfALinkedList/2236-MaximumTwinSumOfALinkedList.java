// Last updated: 3/24/2026, 11:23:00 AM
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
    public int pairSum(ListNode head) {
        ListNode temp = head;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = slow;
        ListNode next_temp = null;

        while (curr != null) {
            next_temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next_temp;
        }
        int max=0;
        while(prev!=null){
            max=Math.max(max,prev.val+temp.val);
            prev=prev.next;
            temp=temp.next;
        }
        return max;
    }
}