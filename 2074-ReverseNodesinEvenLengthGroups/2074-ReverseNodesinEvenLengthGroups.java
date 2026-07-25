// Last updated: 7/25/2026, 11:54:15 AM
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
12    public ListNode reverseEvenLengthGroups(ListNode head) {
13        int length=len(head);
14        return process(head,1,length);
15    }
16    public ListNode process(ListNode head,int size,int length){
17        if(head==null) return null;
18        ListNode ret=null,cur=null;
19        int groupSize = Math.min(size, length);
20        int rem = groupSize;
21        // System.out.println(length+" "+size+" "+head.val);
22        if (groupSize % 2 == 0){
23            while(rem>0 && head!=null){
24                ListNode temp=new ListNode(head.val);
25                if(ret==null){
26                    ret=temp;
27                    cur=temp;
28                }
29                else{
30                    temp.next=cur;
31                    cur=temp;
32                }
33                head=head.next;
34                rem--;
35            }
36            ret.next=process(head,size+1,length - groupSize);
37            return cur;
38        }
39        else{
40            while(rem>0 && head!=null){
41                ListNode temp=new ListNode(head.val);
42                if(ret==null){
43                    ret=temp;
44                    cur=temp;
45                }
46                else{
47                    cur.next=temp;
48                    cur=temp;
49                }
50                head=head.next;
51                rem--;
52            }
53            cur.next=process(head,size+1,length - groupSize);
54            return ret;
55        }
56    }
57    public int len(ListNode head){
58        int i=0;
59        while(head!=null){
60            head=head.next;
61            i++;
62        }
63        return i;
64    }
65}