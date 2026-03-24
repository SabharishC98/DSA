// Last updated: 3/24/2026, 11:26:21 AM
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        check(root,val);
        return root;
    }
    public void check(TreeNode root,int val){
        if(root.val<val){
            if(root.right==null){
                TreeNode temp=new TreeNode(val);
                root.right=temp;
                return;
            }
            else{
                check(root.right,val);
            }
        }
        else{
            if(root.left==null){
                TreeNode temp=new TreeNode(val);
                root.left=temp;
                return;
            }
            else{
                check(root.left,val);
            }
        }
    }
}