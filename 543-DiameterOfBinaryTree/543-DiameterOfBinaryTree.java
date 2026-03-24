// Last updated: 3/24/2026, 11:27:21 AM
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
    static int res=0;
public int height(TreeNode root){
    if(root==null) return 0;
    int l=height(root.left);
    int r=height(root.right);
    res=Math.max(res,l+r);
    return  Math.max(l,r)+1;
}

    public int diameterOfBinaryTree(TreeNode root) {
        res=0;
        height(root);
        return res;
    }
}