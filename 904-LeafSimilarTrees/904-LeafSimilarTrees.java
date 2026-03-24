// Last updated: 3/24/2026, 11:26:01 AM
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
    List<Integer> n1=new ArrayList<>();
    List<Integer> n2=new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if((root1==null && root2==null)) return true;
        if(root1!=null && root1.left==null && root1.right==null) n1.add(root1.val);
        if(root2!=null && root2.left==null && root2.right==null) n2.add(root2.val);
        leafSimilar(root1!=null?root1.left:null,root2!=null?root2.left:null);
        leafSimilar(root1!=null?root1.right:null,root2!=null?root2.right:null);
        if(n1.size()!=n2.size()) return false;
        for(int i=0;i<n1.size();i++){
            if(n1.get(i)-n2.get(i)!=0) return false;
        }
        return true;
    }
}