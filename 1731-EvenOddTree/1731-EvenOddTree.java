// Last updated: 3/24/2026, 11:24:02 AM
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
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null) return true;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int i=0;
        while(!q.isEmpty()){
            int size=q.size();
            int check=i%2==0?Integer.MIN_VALUE:Integer.MAX_VALUE;
            for(int j=0;j<size;j++){
                TreeNode temp=q.poll();
                if(i%2==0){
                    if(temp.val%2==0 || temp.val<=check) return false;
                    else check=temp.val;
                }
                else{
                    if(temp.val%2!=0 || temp.val>=check) return false;
                    else check=temp.val;
                }
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            i++;
        }
        return true;
    }
}