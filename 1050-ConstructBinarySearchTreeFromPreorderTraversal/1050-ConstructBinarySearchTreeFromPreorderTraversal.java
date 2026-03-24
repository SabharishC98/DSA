// Last updated: 3/24/2026, 11:25:23 AM
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
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length==0) return new TreeNode();
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++){
            add(preorder[i],root);
        }
        return root;
    }
    public void add(int n,TreeNode root){
            if(n<root.val){
                if(root.left==null) root.left=new TreeNode(n);
                else add(n,root.left);
            }
            else{
                if(root.right==null) root.right=new TreeNode(n);
                else add(n,root.right);
            }

        
        return;
    }
}