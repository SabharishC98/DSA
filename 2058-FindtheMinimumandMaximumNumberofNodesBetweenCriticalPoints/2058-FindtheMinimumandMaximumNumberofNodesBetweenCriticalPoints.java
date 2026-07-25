// Last updated: 7/25/2026, 2:13:58 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public int[] nodesBetweenCriticalPoints(ListNode head) {
13        if(head==null || head.next==null || head.next.next==null) return new int[]{-1,-1};
14        List<Integer> l=new ArrayList<>();
15        ListNode cur=head.next,prev=head;
16        int i=1;
17        while(cur.next!=null){
18            if(cur.val>prev.val && cur.val>cur.next.val){
19                l.add(i);
20            }
21            if(cur.val<prev.val && cur.val<cur.next.val){
22                l.add(i);
23            }
24            i++;
25            prev=cur;
26            cur=cur.next;
27        }
28        if(l.size()<2) return new int[]{-1,-1};
29        Collections.sort(l);
30        int min=Integer.MAX_VALUE;
31        for(int j=0;j<l.size()-1;j++){
32            min=Math.min(min,l.get(j+1)-l.get(j));
33        }
34        return new int[]{min,l.get(l.size()-1)-l.get(0)};
35    }
36}