// Last updated: 9/25/2026, 2:33:20 PM
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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        int length=len(head);
        return process(head,1,length);
    }
    public ListNode process(ListNode head,int size,int length){
        if(head==null) return null;
        ListNode ret=null,cur=null;
        int groupSize = Math.min(size, length);
        int rem = groupSize;
        // System.out.println(length+" "+size+" "+head.val);
        if (groupSize % 2 == 0){
            while(rem>0 && head!=null){
                ListNode temp=new ListNode(head.val);
                if(ret==null){
                    ret=temp;
                    cur=temp;
                }
                else{
                    temp.next=cur;
                    cur=temp;
                }
                head=head.next;
                rem--;
            }
            ret.next=process(head,size+1,length - groupSize);
            return cur;
        }
        else{
            while(rem>0 && head!=null){
                ListNode temp=new ListNode(head.val);
                if(ret==null){
                    ret=temp;
                    cur=temp;
                }
                else{
                    cur.next=temp;
                    cur=temp;
                }
                head=head.next;
                rem--;
            }
            cur.next=process(head,size+1,length - groupSize);
            return ret;
        }
    }
    public int len(ListNode head){
        int i=0;
        while(head!=null){
            head=head.next;
            i++;
        }
        return i;
    }
}