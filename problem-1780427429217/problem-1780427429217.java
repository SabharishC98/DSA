// Last updated: 6/3/2026, 12:40:29 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int ans=0;
18    public int maxAncestorDiff(TreeNode root) {
19        check(root);
20        return ans;
21    }
22    public int[] check(TreeNode root){
23        if(root==null){
24            return new int[]{Integer.MAX_VALUE,0};
25        }
26        int[] left=check(root.left);
27        int[] right=check(root.right);
28        int[] temp=new int[]{Math.min(root.val,Math.min(left[0],right[0])),Math.max(root.val,Math.max(left[1],right[1]))};
29        if(root.left==null && root.right==null) return temp;
30        ans=Math.max(ans,Math.max(Math.abs(root.val-Math.min(left[0],right[0])),Math.abs(root.val-Math.max(left[1],right[1]))));
31        // System.out.println(root.val+" "+temp[0]+" "+temp[1]+" "+ans);
32        return temp;
33    }
34}