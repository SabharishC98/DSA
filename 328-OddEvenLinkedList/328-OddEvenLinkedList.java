// Last updated: 3/24/2026, 11:28:31 AM
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
    public ListNode oddEvenList(ListNode head) {
        // if(head==null || head.next==null || head.next.next==null) return head;
        // ListNode temp=null;
        // ListNode start=null;
        // ListNode even=head.next;
        // while(head.next!=null && head.next.next!=null){
        //     ListNode nn=new ListNode(head.val);
        //     if(temp==null){ temp=nn; start=temp;}
        //     else{
        //         temp.next=nn;
        //         temp=nn;
        //     }
        //     head=head.next.next;
            
        // }
        // ListNode nn=new ListNode(head.val);
        //     temp.next=nn;
        //         temp=nn;
        //  while(even.next!=null && even.next.next!=null){
        //     nn=new ListNode(even.val);
        //     if(temp==null){ temp=nn; start=temp;}
        //     else{
        //         temp.next=nn;
        //         temp=nn;
        //     }
        //     even=even.next.next;
            
        // }
        // nn=new ListNode(even.val);
        //     temp.next=nn;
        //         temp=nn;
        
        // return start;
        if(head == null || head.next==null){
            return head;
        }
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead=head.next;//it is connect last odd node
        while(even != null && even.next !=null){
            odd.next=even.next;
            odd=odd.next;
            even.next= odd.next;
            even= even.next;
        }
        odd.next=evenHead;
        return head;

    }
}