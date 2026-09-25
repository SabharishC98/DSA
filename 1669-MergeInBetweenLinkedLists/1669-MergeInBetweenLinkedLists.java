// Last updated: 9/25/2026, 2:36:12 PM
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int i=0;
        ListNode temp=list1;
        while(i<a-1){
            temp=temp.next;
            i++;
        }
        ListNode head=temp;
        while(i<=b){
            temp=temp.next;
            i++;
        }
        ListNode tail=list2;
        while(tail!=null && tail.next!=null){
            tail=tail.next;
        }
        tail.next=temp;
        if(a==0) return list2;
        head.next=list2;
        return list1;
        
    }
}