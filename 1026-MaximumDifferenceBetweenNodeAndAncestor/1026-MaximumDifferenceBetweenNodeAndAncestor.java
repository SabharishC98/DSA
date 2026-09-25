// Last updated: 9/25/2026, 2:40:28 PM
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
    int ans=0;
    public int maxAncestorDiff(TreeNode root) {
        check(root);
        return ans;
    }
    public int[] check(TreeNode root){
        if(root==null){
            return new int[]{Integer.MAX_VALUE,0};
        }
        int[] left=check(root.left);
        int[] right=check(root.right);
        int[] temp=new int[]{Math.min(root.val,Math.min(left[0],right[0])),Math.max(root.val,Math.max(left[1],right[1]))};
        if(root.left==null && root.right==null) return temp;
        ans=Math.max(ans,Math.max(Math.abs(root.val-Math.min(left[0],right[0])),Math.abs(root.val-Math.max(left[1],right[1]))));
        // System.out.println(root.val+" "+temp[0]+" "+temp[1]+" "+ans);
        return temp;
    }
}