// Last updated: 9/25/2026, 2:28:40 PM
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp=null;
        ListNode cur=null;
        while(head.next!=null){
            if(temp==null){
                temp=new ListNode(head.val);
                cur=temp;
            }
            cur.next=new ListNode(gcd(head.val,head.next.val));
            cur=cur.next;
            cur.next=new ListNode(head.next.val);
            cur=cur.next;
            
            head=head.next;
        }
        return temp;

    }
     public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}