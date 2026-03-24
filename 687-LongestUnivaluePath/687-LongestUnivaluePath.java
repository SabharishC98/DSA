// Last updated: 3/24/2026, 11:26:45 AM
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
    int ans=0;
    public int longestUnivaluePath(TreeNode root) {
        if(root==null) return ans;
        check(root);
        return ans;
    }
    public int check(TreeNode root){
        if(root==null) return 0;
        int l=check(root.left);
        int r=check(root.right);
        int lp=0,rp=0;
        if(root.left!=null && root.left.val==root.val) lp=l+1;
        if(root.right!=null && root.right.val==root.val) rp=r+1;
        ans=Math.max(ans,lp+rp);
        return Math.max(lp,rp);
    }
}