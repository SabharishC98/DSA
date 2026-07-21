// Last updated: 7/22/2026, 12:27:52 AM
1class Solution {
2    public int[] resultsArray(int[][] queries, int k) {
3        int[] ans=new int[queries.length];
4        PriorityQueue<Integer> pq=new PriorityQueue<>((a, b) -> b - a);
5        for(int i=0;i<queries.length;i++){
6            pq.add(Math.abs(queries[i][0])+Math.abs(queries[i][1]));
7            if(pq.size()<k){
8                ans[i]=-1;
9                continue;
10            }
11            if(pq.size()>k){
12                pq.poll();
13            }
14            ans[i]=pq.peek();
15        }
16        return ans;
17    }
18}