// Last updated: 3/24/2026, 11:26:12 AM
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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> n = new HashSet<>();
    for (int num : nums) {
            n.add(num);
        }
        int count=0,c=0;
        while(head!=null){
            if(n.contains(head.val)){
                if(c==0){
                    count++;
                    c++;
                }
            }
            else c=0;
            head=head.next;
        }
        return count;
    }
}