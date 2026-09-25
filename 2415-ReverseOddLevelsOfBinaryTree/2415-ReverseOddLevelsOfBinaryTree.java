// Last updated: 9/25/2026, 2:30:56 PM
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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null) return root;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int len=q.size();
            List<TreeNode> temp=new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode cur=q.poll();
                if(level%2!=0) temp.add(cur);
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
            if(level%2!=0){
                int i=0,j=temp.size()-1;
                while(i<j){
                    int t=temp.get(i).val;
                    temp.get(i).val=temp.get(j).val;
                    temp.get(j).val=t;
                    i++;
                    j--;
                }
            }
            level++;
        }
        return root;
    }
}