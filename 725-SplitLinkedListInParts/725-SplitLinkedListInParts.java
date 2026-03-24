// Last updated: 3/24/2026, 11:26:39 AM
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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int s=size(head);
        int p=s/k;
        ListNode[] arr=new ListNode[k];
        for(int i=1;i<k+1;i++){
            if(i<=s%k){
                ListNode temp=null,cur=null;
                int j=0;
                while(j<p+1){
                    if(temp==null){
                        temp=new ListNode(head.val);
                        cur=temp;
                    }
                    else{
                        ListNode nn=new ListNode(head.val);
                        cur.next=nn;
                        cur=nn;
                    }
                    j++;
                    head=head.next;
                }
                arr[i-1]=temp;
            }
            else{
                ListNode temp=null,cur=null;
                int j=0;
                while(j<p){
                    if(temp==null){
                        temp=new ListNode(head.val);
                        cur=temp;
                    }
                    else{
                        ListNode nn=new ListNode(head.val);
                        cur.next=nn;
                        cur=nn;
                    }
                    j++;
                    head=head.next;
                }
                arr[i-1]=temp;
            }
        }
        return arr;
    }
    public int size(ListNode h){
        int i=0;
        while(h!=null){
            i++;
            h=h.next;
        }
        return i;
    }
}