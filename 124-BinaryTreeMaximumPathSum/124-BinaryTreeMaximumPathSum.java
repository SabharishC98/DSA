// Last updated: 3/24/2026, 11:30:30 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        check(root);
        return max;
    }
    public int check(TreeNode root){
        if(root==null) return 0;
        int l=check(root.left);
        int r=check(root.right);
        max=Math.max(Math.max(max,l+r+root.val),root.val);
        max=Math.max(Math.max(root.val+l,root.val+r),max);
        return Math.max(Math.max(l,r)+root.val,root.val);
    }
}