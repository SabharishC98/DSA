// Last updated: 3/24/2026, 11:22:48 AM
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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=null,cur=null;
        int s=0,sum=0;
        while(head!=null){
            if(head.val==0 && s==1){
                ListNode nn=new ListNode(sum);
                if(temp==null){
                    temp=nn;
                    cur=nn;
                }
                else{
                    cur.next=nn;
                    cur=nn;
                }
                sum=0;
            }
            else if(head.val==0){
                s=1;
            }
            else{
                sum+=head.val;
            }
            head=head.next;
        }
        return temp;
    }
}