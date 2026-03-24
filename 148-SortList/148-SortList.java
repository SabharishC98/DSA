// Last updated: 3/24/2026, 11:30:06 AM
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
// class Solution {
//     public ListNode sortList(ListNode head) {
//         ListNode temp=null;
//         ListNode check=null;
//         ListNode st=null;
//         while(head!=null){
//             ListNode nn=new ListNode(head.val);
//             if(temp==null){
//                 temp=nn;
//                 check=nn;
//                 st=nn;
//             }
//             else{
//                 if(nn.val<st.val){
//                     nn.next=temp;
//                     temp=nn;
//                     check=nn;
//                     st=nn;
//                 }
//                 else{
//                     while(check!=null){
//                         if(check.next!=null && check.val<=nn.val && check.next.val>nn.val){
//                             nn.next=check.next;
//                             check.next=nn;
//                             check=st;
//                             break;
//                         }
//                         if(check.next==null){
//                             check.next=nn;
//                             check=st;
//                             break;
//                         }
//                         check=check.next;
//                     }
//                 }
//             }
//             head=head.next;
//         }
//         return st;
//     }
// }
// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode sortList(ListNode head) {
//         if (head == null || head.next == null) return head;

//         ListNode sorted = null; // head of sorted list

//         while (head != null) {
//             ListNode curr = new ListNode(head.val);
            
//             // Insert at beginning if needed
//             if (sorted == null || curr.val < sorted.val) {
//                 curr.next = sorted;
//                 sorted = curr;
//             } else {
//                 // Find position in sorted list
//                 ListNode ptr = sorted;
//                 while (ptr.next != null && ptr.next.val <= curr.val) {
//                     ptr = ptr.next;
//                 }
//                 curr.next = ptr.next;
//                 ptr.next = curr;
//             }
//             head = head.next;
//         }

//         return sorted;
//     }
// }
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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        // Split list into two halves
        ListNode mid = getMiddle(head);
        ListNode right = mid.next;
        mid.next = null;

        // Sort each half
        ListNode leftSorted = sortList(head);
        ListNode rightSorted = sortList(right);

        // Merge sorted halves
        return merge(leftSorted, rightSorted);
    }

    // Find the middle node (slow-fast pointer)
    private ListNode getMiddle(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted linked lists
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;

        return dummy.next;
    }
}
