// Last updated: 6/1/2026, 6:06:39 PM
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
17    Map<Integer,Integer> map=new HashMap<>();
18    int maxFreq=Integer.MIN_VALUE;
19    int size=0;
20    public int[] findFrequentTreeSum(TreeNode root) {
21        check(root);
22        int[] ans=new int[size];
23        int j=0;
24        for(Integer i:map.keySet()){
25            // System.out.println(i+" "+map.get(i));
26            if(map.get(i)==maxFreq){
27                ans[j++]=i;
28            }
29        }
30        return ans;
31    }
32    public int check(TreeNode root){
33        if(root==null) return 0;
34        int left=check(root.left);
35        int right=check(root.right);
36        root.val+=left+right;
37        map.put(root.val, map.getOrDefault(root.val, 0)+1);
38        if(map.get(root.val)>maxFreq) {
39            maxFreq=map.get(root.val);
40            size=1;
41        }
42        else if(map.get(root.val)==maxFreq){
43            size++;
44        }
45        return root.val;
46    }
47}