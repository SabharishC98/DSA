// Last updated: 3/24/2026, 11:25:14 AM
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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int index=1,max=Integer.MIN_VALUE,ans=0;
        while(!q.isEmpty()){
            int t=q.size(),sum=0;
            for(int i=0;i<t;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
                sum+=temp.val;
            }
            if(sum>max){
                max=sum;
                ans=index;
            }
            index++;
        }
        return ans;
    }
}