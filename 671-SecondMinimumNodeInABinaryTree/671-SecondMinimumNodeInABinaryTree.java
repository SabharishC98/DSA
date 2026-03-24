// Last updated: 3/24/2026, 11:26:48 AM
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
    int second=Integer.MAX_VALUE;
    int first=Integer.MAX_VALUE;
    boolean entry=false;
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null) return -1;
        check(root);
        if(entry==false) return -1;
        return second;
    }
    public void check(TreeNode root){
        if(root==null) return;
        if(root.val<first){
            second=first;
            first=root.val;
            
        }
        else if(root.val<=second && root.val!=first){ second=root.val; entry=true;}
        check(root.left);
        check(root.right);
    }
}