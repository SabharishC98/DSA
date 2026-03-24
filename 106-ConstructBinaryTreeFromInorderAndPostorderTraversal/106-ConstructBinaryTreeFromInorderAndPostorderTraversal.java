// Last updated: 3/24/2026, 11:30:51 AM
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
    HashMap<Integer,Integer> map=new HashMap<>();
    int pi;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        pi=postorder.length-1;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return check(postorder,0,inorder.length-1);
    }
    public TreeNode check(int[] postorder,int si,int li){
        if(si>li) return null;
        int ele=postorder[pi--];
        int mid=map.get(ele);
        TreeNode root=new TreeNode(ele);
        root.right=check(postorder,mid+1,li);
        root.left=check(postorder,si,mid-1);
        return root;
    }
}