// Last updated: 6/7/2026, 10:23:47 PM
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
17    HashMap<Integer,TreeNode> map=new HashMap<>();
18    public TreeNode createBinaryTree(int[][] descriptions) {
19        Set<TreeNode> set=new HashSet<>();
20        Set<TreeNode> set1=new HashSet<>();
21        for(int i[]:descriptions){
22            TreeNode parent,child;
23            if(!map.containsKey(i[0])){
24                parent=new TreeNode(i[0]);
25                map.put(i[0],parent);
26            }
27            else{
28                parent=map.get(i[0]);
29            }
30            if(!map.containsKey(i[1])){
31                child=new TreeNode(i[1]);
32                map.put(i[1],child);
33            }
34            else{
35                child=map.get(i[1]);
36            }
37            if(i[2]==1) parent.left=child;
38            else parent.right=child;
39            set.add(child);
40            set1.add(parent);
41        }
42        for(TreeNode i:set1) if(!set.contains(i)) return i;
43        return null;
44    }
45}