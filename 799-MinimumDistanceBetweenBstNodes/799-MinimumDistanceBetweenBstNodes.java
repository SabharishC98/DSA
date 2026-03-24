// Last updated: 3/24/2026, 11:26:19 AM
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
    
    ArrayList<Integer> n=new ArrayList<>();
    public int minDiffInBST(TreeNode root) {
        check(root);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n.size()-1;i++){
            min=Math.min(min,Math.abs(n.get(i)-n.get(i+1)));
        }
        return min;
    }
    public void check(TreeNode root){
        if(root==null) return ;
        check(root.left);
        n.add(root.val);
        check(root.right);
        
    }
}