// Last updated: 3/24/2026, 11:29:31 AM
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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode a=null,b=head,c=head.next;
        while(b!=null){
            b.next=a;
            a=b;
            b=c;
            if(c!=null) c=c.next;
        }
        return a;

        // ListNode temp=null;
        // while(head!=null){
            
        //         ListNode nn=new ListNode(head.val);
        //         nn.next=temp;
        //         temp=nn;
            
        //     head=head.next;
        // }
        // return temp;
    }
}