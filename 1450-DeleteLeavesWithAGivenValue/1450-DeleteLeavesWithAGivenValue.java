// Last updated: 3/24/2026, 11:24:32 AM
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
    public TreeNode removeLeafNodes(TreeNode root, int x) {
        check(root,x);
        if(root.left==null && root.right==null && root.val==x) return null;
        return root;
    }
    public static void check(TreeNode root, int x){
        if(root==null) return;
        check(root.left,x);
        check(root.right,x);
        if(root.left!=null && root.left.left==null && root.left.right==null && root.left.val==x) root.left=null;
        if(root.right!=null && root.right.left==null && root.right.right==null && root.right.val==x) root.right=null;
    }
}
    