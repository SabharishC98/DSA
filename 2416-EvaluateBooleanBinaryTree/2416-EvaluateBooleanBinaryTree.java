// Last updated: 3/24/2026, 11:22:26 AM
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
    public boolean evaluateTree(TreeNode root) {
        if(root.val==2) return evaluateTree(root.left)||evaluateTree(root.right);
        if(root.val==3) return evaluateTree(root.left)&&evaluateTree(root.right);
        if(root.val==0) return false;
        return true;
    }
}