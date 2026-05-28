// Last updated: 5/29/2026, 2:10:49 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public TreeNode reverseOddLevels(TreeNode root) {
18        if(root==null) return root;
19        Queue<TreeNode> q=new LinkedList<>();
20        q.add(root);
21        int level=0;
22        while(!q.isEmpty()){
23            int len=q.size();
24            List<TreeNode> temp=new ArrayList<>();
25            for(int i=0;i<len;i++){
26                TreeNode cur=q.poll();
27                if(level%2!=0) temp.add(cur);
28                if(cur.left!=null) q.add(cur.left);
29                if(cur.right!=null) q.add(cur.right);
30            }
31            if(level%2!=0){
32                int i=0,j=temp.size()-1;
33                while(i<j){
34                    int t=temp.get(i).val;
35                    temp.get(i).val=temp.get(j).val;
36                    temp.get(j).val=t;
37                    i++;
38                    j--;
39                }
40            }
41            level++;
42        }
43        return root;
44    }
45}