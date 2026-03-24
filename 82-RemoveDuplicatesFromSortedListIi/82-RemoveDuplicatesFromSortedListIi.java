// Last updated: 3/24/2026, 11:31:16 AM
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
    public ListNode deleteDuplicates(ListNode head) {
        int arr[]=new int[201];
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<0){
                arr[temp.val*-1]++;
            }
            else if(temp.val==0) arr[0]++;
            else{
                arr[temp.val+100]++;
            }
            temp=temp.next;
        }
        ListNode ans=null;
        temp=null;
        for(int i=0;i<201;i++){
            if(arr[i]==1){
                int data=i;
                if(i>100){
                    data=i-100;
                }
                else{
                    data*=-1;
                }
                ListNode nn=new ListNode(data);
                if(ans==null){
                    ans=nn;
                    temp=ans;
                }
                else{
                    if(data<0){
                        nn.next=ans;
                        
                        ans=nn;
                    }
                    else{
                    temp.next=nn;
                    temp=temp.next;}
                }
            }
        }
        return ans;

    }
}