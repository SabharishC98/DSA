// Last updated: 3/24/2026, 11:29:10 AM
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
    List<Integer> ans=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        check(root);
        return ans.get(k-1);
    }
    public void check(TreeNode root){
        if(root==null) return;
        check(root.left);
        ans.add(root.val);
        check(root.right);
    }
}