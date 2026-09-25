// Last updated: 9/25/2026, 2:43:01 PM
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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        int max=maxDepth(root);
        return check(root,max,0);
    }
    public TreeNode check(TreeNode root,int max,int cur){
        if(root==null) return null;
        if(cur==max-1){
            return root;
        }
        TreeNode left=check(root.left,max,cur+1);
        TreeNode right=check(root.right,max,cur+1);
        if(left!=null && right!=null) return root;
        return left!=null?left:right;
    }
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return  1 + Math.max(maxDepth(root.right),maxDepth(root.left));
    }
}