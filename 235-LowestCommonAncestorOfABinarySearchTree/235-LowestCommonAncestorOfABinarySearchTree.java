// Last updated: 3/24/2026, 11:29:05 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int m1=Math.min(p.val,q.val);
        int m2=Math.max(p.val,q.val);
        if(root==null) return null;
        while(true){
            if(root==null) return null;
        if(root.val>=m1 && root.val<=m2) return root;
        else if(root.val<m1){
            root=root.right;
        }
        else root=root.left;}
    }
}