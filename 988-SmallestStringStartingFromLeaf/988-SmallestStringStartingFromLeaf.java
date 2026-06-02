// Last updated: 6/3/2026, 12:20:40 AM
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
17    public String smallestFromLeaf(TreeNode root) {
18        if(root==null) return "";
19        PriorityQueue<String> pq=new PriorityQueue<>();
20        dfs(root,"",pq);
21        return pq.poll();
22    }
23    public void dfs(TreeNode root,String sb,PriorityQueue<String> pq){
24        if(root.left==null && root.right==null){
25            pq.add((char)(root.val+97)+sb);
26            return;
27        }
28        if(root.left!=null)
29        dfs(root.left,(char)(root.val+97)+sb,pq);
30        if(root.right!=null)
31        dfs(root.right,(char)(root.val+97)+sb,pq);
32    }
33}