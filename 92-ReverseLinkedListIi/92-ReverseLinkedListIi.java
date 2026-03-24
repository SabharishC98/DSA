// Last updated: 3/24/2026, 11:31:06 AM
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=null;
        ListNode rev=null;
        ListNode start=null;
        ListNode end=null;
        int i=1;
        while(head!=null){
            ListNode n=new ListNode(head.val);
            if(i>=left && i<=right){
                if(rev==null){
                    rev=n;
                    end=n;
                }
                else{
                    
                    n.next=rev;
                    rev=n;
                }
                if(i==right){

                    if(temp!=null){
                    temp.next=rev;}
                    
                    else{
                        temp=rev;
                        start=temp;
                    }
                    while(temp.next!=null){
                        temp=temp.next;
                    }
                }
            }
            else{
            if(start==null){ temp=n; start=temp;}
            else{
                temp.next=n;
                temp=n;
            }
            }
            head=head.next;
            i++;
        }
        return start;
    }
}