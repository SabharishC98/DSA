// Last updated: 3/24/2026, 11:31:39 AM
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
    public ListNode rotateRight(ListNode head, int k) {
        int len=length(head);
        if(len==0 || len==1) return head;
        for(int i=0;i<k%len;i++){
            ListNode temp=head;
            while(temp.next.next!=null){
            temp=temp.next;
            }
            temp.next.next=head;
            head=temp.next;
            temp.next=null;
        }
        return head;
    }
    public int length(ListNode head){
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        return c;
    }
}