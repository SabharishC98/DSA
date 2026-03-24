// Last updated: 3/24/2026, 11:27:11 AM
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
    int flag=0;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(isSameTree(root,subRoot)) return true;
        boolean right=false,left=false;
        if(root.right!=null){
            right=isSubtree(root.right,subRoot);
        }
        if(root.left!=null){
            left=isSubtree(root.left,subRoot);
        }
        return right||left;
        // return isSubtree(root.right,subRoot) || isSubtree(root.left,subRoot);
        
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p==null && q!=null)||(p!=null && q==null)) return false;
        if(p==null && q==null) return true;
        if(p.val!=q.val) return false;
        return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
        
        
    }
}