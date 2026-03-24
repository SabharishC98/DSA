// Last updated: 3/24/2026, 11:27:58 AM
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
    public ListNode addTwoNumbers(ListNode la1, ListNode la2) {
        ListNode l1=null;
        ListNode l2=null;
        while(la1!=null){
            ListNode nn=new ListNode(la1.val);
            if(l1==null){
                l1=nn;
            }
            else{
                nn.next=l1;
                l1=nn;
            }
            la1=la1.next;
        }
        while(la2!=null){
            ListNode nn=new ListNode(la2.val);
            if(l2==null){
                l2=nn;
            }
            else{
                nn.next=l2;
                l2=nn;
            }
            la2=la2.next;
        }
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
        nn=nn.next;
        ListNode ans=null;
        while(nn!=null){
            ListNode n=new ListNode(nn.val);
            if(ans==null) ans=n;
            else{
                n.next=ans;
                ans=n;
            }
            nn=nn.next;
        }
        return ans;
    }
}