// Last updated: 3/24/2026, 11:32:26 AM
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode(1);
        ListNode temp=ans;
        while(l1!=null && l2!=null){
            if(l1.val>=l2.val){
                temp.next=new ListNode(l2.val);
                temp=temp.next;
                l2=l2.next;
            }
            else{
                temp.next=new ListNode(l1.val);
                temp=temp.next;
                l1=l1.next;
            }
        }
        if(l1==null){
            temp.next=l2;
        }
        else{
            temp.next=l1;
        }
        return ans.next;
    }
}