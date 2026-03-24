// Last updated: 3/24/2026, 11:32:23 AM
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
    public ListNode swapPairs(ListNode head) {
        ListNode cur=head;
        while(cur!=null){
            if(cur.next!=null){
            int t=cur.val;
            cur.val=cur.next.val;
            cur.next.val=t;
            cur=cur.next.next;}
            else{
                cur=cur.next;
            }
        }
        return head;
    }
}