// Last updated: 3/24/2026, 11:27:27 AM
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
    public ListNode swapNodes(ListNode head, int k) {
        int left=k;
        int right=length(head)-k+1;
        left=Math.min(left,right);
        right=Math.max(k,right);
        ListNode start=null;
        ListNode end=null;
        ListNode temp=head;
        int i=1;
        while(i<left){
            temp=temp.next;
            i++;
        }
        start=temp;
        while(i<right){
            temp=temp.next;
            i++;
        }
        end=temp;
        int t=start.val;
        start.val=end.val;
        end.val=t;






        // ListNode temp=null;
        // ListNode rev=null;
        // ListNode start=null;
        // ListNode end=null;
        // int i=1;
        // while(head!=null){
        //     ListNode n=new ListNode(head.val);
        //     if(i>=left && i<=right){
        //         if(rev==null){
        //             rev=n;
        //             end=n;
        //         }
        //         else{
                    
        //             n.next=rev;
        //             rev=n;
        //         }
        //         if(i==right){

        //             if(temp!=null){
        //             temp.next=rev;}
                    
        //             else{
        //                 temp=rev;
        //                 start=temp;
        //             }
        //             while(temp.next!=null){
        //                 temp=temp.next;
        //             }
        //         }
        //     }
        //     else{
        //     if(start==null){ temp=n; start=temp;}
        //     else{
        //         temp.next=n;
        //         temp=n;
        //     }
        //     }
        //     head=head.next;
        //     i++;
        // }
        return head;
    }
    public int length(ListNode head){
        ListNode temp= head;
        int c=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        return c;
    }
    
}