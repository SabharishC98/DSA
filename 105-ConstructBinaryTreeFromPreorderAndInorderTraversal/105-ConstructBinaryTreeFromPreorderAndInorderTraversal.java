// Last updated: 3/24/2026, 11:30:52 AM
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
    int pi=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return dfs(preorder,0,preorder.length-1);
    }
    public TreeNode dfs(int[] preorder,int si,int li){
        if(si<=li){
            int ele=preorder[pi++];
            int mid=map.get(ele);
            TreeNode root=new TreeNode(ele);
            root.left=dfs(preorder,si,mid-1);
            root.right=dfs(preorder,mid+1,li);
            return root;
        }
        return null;
    }
}