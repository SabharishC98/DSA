// Last updated: 3/24/2026, 11:28:57 AM
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
    List<String> ans=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null) return ans;
        check(root,new String());
        return ans;
    }
    public void check(TreeNode root,String temp){
        if(root.left==null && root.right==null){
            temp+=root.val;
            ans.add(temp);
            return;
        }
        temp+=String.valueOf(root.val)+"->";
        if(root.left!=null) check(root.left,temp);
        if(root.right!=null) check(root.right,temp);
    }
}