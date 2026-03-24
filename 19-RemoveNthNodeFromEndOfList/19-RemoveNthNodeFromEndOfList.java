// Last updated: 3/24/2026, 11:32:29 AM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || (head.next==null && n==1)) return null;
        ListNode slow=head,fast=head;
        int i=0;
        while(i<n){ fast=fast.next; i++;
        if(fast==null){
        return head.next;
        } 
        }
        
        while(fast!=null && fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;

    }




    //     int c=length(head);
    //     if(c==1){
    //         head=null;
    //         return head;
    //     }
    //     if(c-n==0){
    //         head=head.next;
    //         return head;
    //     }
    //     ListNode t=head;
    //     for(int i=1;i<=c;i++){
    //         if(i==c-n){
    //             t.next=t.next.next;
    //             break;
    //         }
    //         t=t.next;
    //     }
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
    // }
}