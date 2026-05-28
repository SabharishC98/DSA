// Last updated: 5/28/2026, 4:01:18 PM
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
17    public boolean isCompleteTree(TreeNode root) {
18        if(root==null) return true;
19        Queue<TreeNode> q=new LinkedList<>();
20        boolean f=false;
21        q.add(root);
22        while(!q.isEmpty()){
23            TreeNode temp=q.poll();
24            if(temp.left!=null){
25                if(f) return false; 
26                q.add(temp.left);
27            }
28            else f=true;
29            if(temp.right!=null){
30                if(f) return false; 
31                q.add(temp.right);
32            }
33            else f=true;
34        }
35        return true;
36    }
37}