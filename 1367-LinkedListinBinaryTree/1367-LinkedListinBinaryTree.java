// Last updated: 7/24/2026, 11:58:09 PM
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
11/**
12 * Definition for a binary tree node.
13 * public class TreeNode {
14 *     int val;
15 *     TreeNode left;
16 *     TreeNode right;
17 *     TreeNode() {}
18 *     TreeNode(int val) { this.val = val; }
19 *     TreeNode(int val, TreeNode left, TreeNode right) {
20 *         this.val = val;
21 *         this.left = left;
22 *         this.right = right;
23 *     }
24 * }
25 */
26class Solution {
27    public boolean isSubPath(ListNode head, TreeNode root) {
28        if (root == null) return false;
29
30        return match(head, root)
31                || isSubPath(head, root.left)
32                || isSubPath(head, root.right);
33    }
34
35    private boolean match(ListNode head, TreeNode root) {
36        if (head == null) return true;
37        if (root == null) return false;
38
39        if (head.val != root.val) return false;
40
41        return match(head.next, root.left)
42                || match(head.next, root.right);
43    }
44}