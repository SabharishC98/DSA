// Last updated: 3/24/2026, 11:30:09 AM
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
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode sorted = null; // head of sorted list

        while (head != null) {
            ListNode curr = new ListNode(head.val);
            
            // Insert at beginning if needed
            if (sorted == null || curr.val < sorted.val) {
                curr.next = sorted;
                sorted = curr;
            } else {
                // Find position in sorted list
                ListNode ptr = sorted;
                while (ptr.next != null && ptr.next.val <= curr.val) {
                    ptr = ptr.next;
                }
                curr.next = ptr.next;
                ptr.next = curr;
            }
            head = head.next;
        }

        return sorted;
    }
}