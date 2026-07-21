// Last updated: 7/21/2026, 9:57:11 AM
1class Solution {
2    public int edgeScore(int[] edges) {
3        long[] inorder=new long[edges.length];
4        for(int i=0;i<edges.length;i++){
5            inorder[edges[i]]+=i;
6        }
7        long max=Long.MIN_VALUE;
8        int ans=-1;
9        for(int i=0;i<inorder.length;i++){
10            // System.out.println(inorder[i]);
11            if(inorder[i]>max){
12                max=inorder[i];
13                ans=i;
14            }
15        }
16        return ans;
17    }
18}