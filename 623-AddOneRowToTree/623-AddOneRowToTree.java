// Last updated: 3/24/2026, 11:26:59 AM
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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode temp=new TreeNode(val);
            temp.left=root;
            return temp;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            depth--;
            for(int i=0;i<size;i++){
                
                TreeNode temp=q.poll();
                if(depth==1){
                    TreeNode ltemp=temp.left;
                    TreeNode rtemp=temp.right;
                    temp.left=new TreeNode(val);
                    temp.right=new TreeNode(val);
                    temp.left.left=ltemp;
                    temp.right.right=rtemp;
                }
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);

            }
            if(depth==1) break;
                    
        }
        return root;
    }
}