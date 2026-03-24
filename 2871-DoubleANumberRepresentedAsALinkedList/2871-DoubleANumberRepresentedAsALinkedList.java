// Last updated: 3/24/2026, 11:21:41 AM
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
    public ListNode doubleIt(ListNode head) {
        ListNode rev=null;
        
        ListNode h=head;
        while(head!=null){
            ListNode nn=new ListNode(head.val);
            if(rev==null){
                rev=nn;
            }
            else{
                nn.next=rev;
                rev=nn;
            }
            head=head.next;
        }
        int carry=0;
        ListNode temp=rev;
        while(rev!=null){
            int prod=rev.val*2;
            rev.val=prod%10+carry;
            if(prod>9){
                carry=prod/10;
            }
            else carry=0;
            
            if(rev.next==null && carry!=0){
                rev.next=new ListNode(carry);
                break;
            }
            rev=rev.next;
        }
        rev=null;
        while(temp!=null){
            ListNode nn=new ListNode(temp.val);
            if(rev==null){
                rev=nn;
            }
            else{
                nn.next=rev;
                rev=nn;
            }
            temp=temp.next;
        }
        return rev;
    }
}