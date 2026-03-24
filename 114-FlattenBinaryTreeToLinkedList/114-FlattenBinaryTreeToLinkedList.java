// Last updated: 3/24/2026, 11:30:40 AM
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
    TreeNode cur=null;
    public void flatten(TreeNode root) {
        if(root==null) return;
        flatten(root.right);
        flatten(root.left);
        root.right=cur;
        root.left=null;
        cur=root;
    }
    // public void check(TreeNode root){
    //     if(root==null) return;
    //     TreeNode temp=null;
    //     temp=root.right;
    //     root.right=root.left;
    //     root.left=null;
    //     check(root.right);
    //     if(temp==null) return;
    //     while(root!=null && root.right!=null){
    //         root=root.right;
    //     }
    //     check(temp);
    //     root.right=temp;
    // }
}