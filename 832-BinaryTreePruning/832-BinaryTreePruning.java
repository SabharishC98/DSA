// Last updated: 3/24/2026, 11:26:13 AM
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
    public TreeNode pruneTree(TreeNode root) {
        if(root==null) return root;
		boolean r=check(root);
		return r?root:null;
    }
    public static boolean check(TreeNode root){
		if(root==null) return false;
		boolean l=check(root.left);
		boolean r=check(root.right);
		if(root.left!=null && l==false) root.left=null;
		if(root.right!=null && r==false) root.right=null;
		return root.val==1||l||r;
	}
}