// Last updated: 3/24/2026, 11:29:34 AM
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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        if(head.val==val){
            head=head.next;
        }
        if(head==null) return head;
        ListNode cur=head;
        while(cur.next!=null){
            if(cur.next!=null && cur.val==val){
                cur.val=cur.next.val;
                cur.next=cur.next.next;
            }
            else
            cur=cur.next;
        }
        cur=head;
        if(cur.next!=null){
        while(cur.next.next!=null) cur=cur.next;
        if(cur.next.val==val) cur.next=null;}
        if(cur.next==null && cur.val==val) head=null;
        return head;
    }
}