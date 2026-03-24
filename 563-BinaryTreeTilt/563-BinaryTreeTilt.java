// Last updated: 3/24/2026, 11:27:17 AM
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
    int sum=0;
    public int findTilt(TreeNode root) {
        if(root==null) return 0;
        check(root);
        return sum;
    }
    public int check(TreeNode root){
        if(root==null) return 0;
        int a=0,b=0;
        if(root.right!=null){
        root.val+=check(root.right)+root.right.val;
        a=root.right.val;}
        if(root.left!=null){
        root.val+=check(root.left)+root.left.val;
        b=root.left.val;}
        sum+=Math.abs(a-b);
        return 0;

    }
}