// Last updated: 3/24/2026, 11:31:12 AM
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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) return head;
        ListNode left=null,right=null,l=null,r=null;
        while(head!=null){
            ListNode nn=new ListNode(head.val);
            if(head.val<x){
                if(left==null){
                    left=nn;
                    l=left;
                }
                else{
                    left.next=nn;
                    left=left.next;
                }
            }
            else{
                if(right==null){
                    right=nn;
                    r=right;
                }
                else{
                    right.next=nn;
                    right=right.next;
                }
            }
            head=head.next;
        }
        if(left!=null){
        left.next=r;
        return l;}
        else return r;
    }
}