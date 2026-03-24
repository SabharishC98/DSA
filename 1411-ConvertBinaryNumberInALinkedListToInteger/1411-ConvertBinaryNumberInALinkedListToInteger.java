// Last updated: 3/24/2026, 11:24:42 AM
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
    public int getDecimalValue(ListNode head) {
        int s=0;
        while(head!=null){
            s=s*2+head.val;
            head=head.next;
        }
        // //int decimal = Integer.parseInt(s, 2);
        // int k=0,ans=0,l=s.length()-1;
        // while(l>=0){
        //     ans+=(s.charAt(l)-48)*Math.pow(2,k);
        //     l--;
        //     k++;
        // }
        return s;
    }
}