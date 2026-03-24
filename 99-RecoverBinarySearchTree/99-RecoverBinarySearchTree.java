// Last updated: 3/24/2026, 11:31:00 AM
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
    List<Integer> temp;
    int i=0;
    public void recoverTree(TreeNode root) {
        if(root==null) return;
        inorder(root);
        temp=new ArrayList(list);
        Collections.sort(temp);
        check(root);
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public void check(TreeNode root){
        if(root==null) return;
        check(root.left);
        root.val=temp.get(i++);
        check(root.right);
    }
}