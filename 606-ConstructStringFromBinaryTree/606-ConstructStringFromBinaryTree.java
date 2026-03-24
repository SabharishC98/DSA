// Last updated: 3/24/2026, 11:27:03 AM
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
    StringBuilder s=new StringBuilder("");
    public String tree2str(TreeNode root) {
        if(root==null){ return s.toString();}
        if(root.right==null && root.left==null){
            s.append(root.val);
            return s.toString();
        }
        s.append(root.val+"(");

        tree2str(root.left);
        s.append(")");
        if(root.right!=null){
        s.append("(");
        tree2str(root.right);
        s.append(")");
        }
        return s.toString();
    }
}