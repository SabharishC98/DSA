// Last updated: 3/24/2026, 11:31:01 AM
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
    List<Integer> n=new ArrayList<>();
    int index=0;
    public boolean isValidBST(TreeNode root) {
        check(root);
        for(int i=0;i<n.size()-1;i++){
            if(n.get(i)>=n.get(i+1)) return false;
        }
        return true;
    }
    public void check(TreeNode root){
        if(root==null) return ;
        check(root.left);
        n.add(root.val);
        check(root.right);
        
    }
}