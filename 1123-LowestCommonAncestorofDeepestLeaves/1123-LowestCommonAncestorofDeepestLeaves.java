// Last updated: 5/28/2026, 5:06:11 PM
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
17    public TreeNode lcaDeepestLeaves(TreeNode root) {
18        int max=maxDepth(root);
19        return check(root,max,0);
20    }
21    public TreeNode check(TreeNode root,int max,int cur){
22        if(root==null) return null;
23        if(cur==max-1){
24            return root;
25        }
26        TreeNode left=check(root.left,max,cur+1);
27        TreeNode right=check(root.right,max,cur+1);
28        if(left!=null && right!=null) return root;
29        return left!=null?left:right;
30    }
31    public int maxDepth(TreeNode root) {
32        if(root==null) return 0;
33        return  1 + Math.max(maxDepth(root.right),maxDepth(root.left));
34    }
35}