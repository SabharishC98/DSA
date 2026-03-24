// Last updated: 3/24/2026, 11:32:50 AM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode nn=new ListNode(1);
        ListNode tem=nn;
        int c=0;
        while(l1!=null || l2!=null || c!=0){
            int x=(l1!=null)?l1.val:0;
            int y=(l2!=null)?l2.val:0;
            int sum=x+y+c;
            tem.next=new ListNode(sum%10);
            c=sum/10;
            tem=tem.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        return nn.next;
    }
}