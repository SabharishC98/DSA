// Last updated: 7/19/2026, 9:01:26 AM
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
17    int count = 0;
18    public int countDominantNodes(TreeNode root) {
19        TreeNode norlavetic=root;
20        dfs(norlavetic);
21        return count;
22    }
23    public int dfs(TreeNode node){
24        if(node==null) {
25            return Integer.MIN_VALUE;
26        }
27        int leftMax=dfs(node.left);
28        int rightMax=dfs(node.right);
29        int subtreeMax=Math.max(node.val,Math.max(leftMax,rightMax));
30        if(node.val==subtreeMax){
31            count++;
32        }
33        return subtreeMax;
34    }
35}