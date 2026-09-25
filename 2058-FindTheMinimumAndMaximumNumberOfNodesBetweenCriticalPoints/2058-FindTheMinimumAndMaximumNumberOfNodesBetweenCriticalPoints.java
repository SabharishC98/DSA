// Last updated: 9/25/2026, 2:33:21 PM
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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return new int[]{-1,-1};
        List<Integer> l=new ArrayList<>();
        ListNode cur=head.next,prev=head;
        int i=1;
        while(cur.next!=null){
            if(cur.val>prev.val && cur.val>cur.next.val){
                l.add(i);
            }
            if(cur.val<prev.val && cur.val<cur.next.val){
                l.add(i);
            }
            i++;
            prev=cur;
            cur=cur.next;
        }
        if(l.size()<2) return new int[]{-1,-1};
        Collections.sort(l);
        int min=Integer.MAX_VALUE;
        for(int j=0;j<l.size()-1;j++){
            min=Math.min(min,l.get(j+1)-l.get(j));
        }
        return new int[]{min,l.get(l.size()-1)-l.get(0)};
    }
}