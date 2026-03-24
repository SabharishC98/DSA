// Last updated: 3/24/2026, 11:21:07 AM
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode temp=null;
        ListNode start=null;
        Set<Integer> removeSet = new HashSet<>();
        for (int num : nums) {
            removeSet.add(num);
        }
        while(head!=null){
            int n=head.val;
            if(!removeSet.contains(n)){
                ListNode nn=new ListNode(n);
                if(temp==null){
                    temp=nn;
                    start=nn;
                }
                else{
                    temp.next=nn;
                    temp=nn;
                }
            }
            head=head.next;
        }
        return start;
    }
}