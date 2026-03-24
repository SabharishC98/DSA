// Last updated: 3/24/2026, 11:29:06 AM
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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        int len=size(head);
        Stack<Integer> myStack = new Stack<>();
        int mid=len/2,i=0;
        while(i<mid){
            myStack.push(head.val);
            head=head.next;
            i++;
        }
        i=len%2==0?mid:mid+1;
        if(i==mid+1) head=head.next;
        while(i<len){
            if(myStack.size()!=0 && myStack.peek()==head.val){
                myStack.pop();
            }
            else return false;
            head=head.next;
            i++;
        }
        return myStack.size()==0;
    }
    public int size(ListNode head){
        ListNode t=head;
        int c=0;
        while(t!=null){
            t=t.next;
            c++;
        }
        return c;
    }
}