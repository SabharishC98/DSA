// Last updated: 3/24/2026, 11:25:40 AM
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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        if(root1.val!=root2.val) return false;
        if((root1.left!=null && root2.left!=null && root1.left.val==root2.left.val) || (root1.right!=null && root2.right!=null && root1.right.val==root2.right.val)){
            return flipEquiv(root1.left,root2.left) && flipEquiv(root1.right,root2.right);
        }
        return flipEquiv(root1.left,root2.right) && flipEquiv(root1.right,root2.left);
    }
}