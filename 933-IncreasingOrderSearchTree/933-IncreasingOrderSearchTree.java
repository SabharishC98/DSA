// Last updated: 3/24/2026, 11:25:53 AM
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
    List<Integer> list=new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        TreeNode ans=null,temp=null;
        for(int i=0;i<list.size();i++){
            TreeNode nn=new TreeNode(list.get(i));
            if(ans==null){
                ans=nn;
                temp=ans;
            }
            else{
                temp.right=nn;
                temp=temp.right;
            }
        }
        return ans;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}