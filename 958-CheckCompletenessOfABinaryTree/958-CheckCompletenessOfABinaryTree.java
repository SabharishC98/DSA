// Last updated: 9/25/2026, 2:41:41 PM
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
    public boolean isCompleteTree(TreeNode root) {
        if(root==null) return true;
        Queue<TreeNode> q=new LinkedList<>();
        boolean f=false;
        q.add(root);
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            if(temp.left!=null){
                if(f) return false; 
                q.add(temp.left);
            }
            else f=true;
            if(temp.right!=null){
                if(f) return false; 
                q.add(temp.right);
            }
            else f=true;
        }
        return true;
    }
}