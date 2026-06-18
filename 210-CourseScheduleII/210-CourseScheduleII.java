// Last updated: 6/18/2026, 11:53:11 PM
1class Solution {
2    public int[] findOrder(int n, int[][] prerequisites) {
3        int[] ans=new int[n];
4        int[] inorder=new int[n];
5        Map<Integer,List<Integer>> adj=new HashMap<>();
6        for(int i=0;i<n;i++){
7            adj.putIfAbsent(i,new ArrayList<>());
8        }
9        for(int[] i:prerequisites){
10            inorder[i[0]]++;
11            adj.get(i[1]).add(i[0]);
12        }
13        Queue<Integer> q=new LinkedList<>();
14        for(int i=0;i<n;i++){
15            if(inorder[i]==0) q.add(i);
16        }
17        int index=0;
18        while(!q.isEmpty()){
19            int cur=q.poll();
20            ans[index++]=cur;
21            for(int i:adj.get(cur)){
22                inorder[i]--;
23                if(inorder[i]==0) q.add(i);
24            }
25        }
26        return index==n?ans:new int[]{};
27    }
28}