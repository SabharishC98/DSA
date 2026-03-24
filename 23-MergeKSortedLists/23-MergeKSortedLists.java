// Last updated: 3/24/2026, 11:32:24 AM
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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode temp=lists[i];
            while(temp!=null){
                ans.add(temp.val);
                temp=temp.next;
            }
        }
        Collections.sort(ans);
        ListNode temp=null;
        ListNode ret=null;
        for(int i=0;i<ans.size();i++){
            ListNode nn=new ListNode(ans.get(i));
            if(ret==null){
                ret=nn;
                temp=nn;
            }
            else{
                temp.next=nn;
                temp=temp.next;
            }
        }
        return ret;
    }
}