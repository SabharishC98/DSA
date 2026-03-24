// Last updated: 3/24/2026, 11:23:05 AM
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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode slow=head,fast=head,temp=null;
        while(fast!=null && fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=temp.next.next;
        return head;
    //     int c=length(head);
    //     if(c==1){
    //         head=null;
    //         return head;
    //     }
    //     c=c/2;
    //     ListNode t=head;
    //     for(int i=0;i<c-1;i++){
    //         t=t.next;
    //     }
    //     t.next=t.next.next;
    //     return head;
    // }
    // public int length(ListNode head){
    //     ListNode t=head;
    //     int c=0;
    //     while(t!=null){
    //         t=t.next;
    //         c++;
    //     }
    //     return c;
    }
}