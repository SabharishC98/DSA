// Last updated: 3/24/2026, 11:30:25 AM
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
    List<Integer> n=new ArrayList<>();
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        check(root,0);
        int sum=0;
        for(int i=0;i<n.size();i++){
            sum+=n.get(i);
        }
        return sum;
    }
    public void check(TreeNode root,int sum){
        if(root!=null && root.right==null && root.left==null){ n.add(sum*10+root.val); return;}
        if(root!=null){
        check(root.right,sum*10+root.val);
        check(root.left,sum*10+root.val);}
    }
}