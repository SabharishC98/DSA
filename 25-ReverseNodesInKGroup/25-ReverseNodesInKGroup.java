// Last updated: 3/24/2026, 11:32:22 AM
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null) return head;
        int size=height(head);
        if(size<k) return head;
        int i=0;
        ListNode temp=null;
        ListNode cur=null;
        while(i<k){
            ListNode nn=new ListNode(head.val);
            if(temp==null){
                temp=nn;
                cur=nn;
            }
            else{
                nn.next=temp;
                temp=nn;
            }
            i++;
            head=head.next;
        }
        cur.next=reverseKGroup(head,k);
        return temp;
    }
    public int height(ListNode temp){
        int c=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        return c;
    }
}