// Last updated: 5/29/2026, 2:30:12 AM
1class Solution {
2    public int countCompleteComponents(int n, int[][] edges) {
3        Map<Integer,List<Integer>> map=new HashMap<>();
4        for(int i=0;i<n;i++) map.putIfAbsent(i,new ArrayList<>());
5        for(int i[]:edges){
6            map.get(i[0]).add(i[1]);
7            map.get(i[1]).add(i[0]);
8        }
9        int c=0;
10        boolean[] vis=new boolean[n];
11        for(int i=0;i<n;i++){
12            if(vis[i]) continue;
13            Queue<Integer> q=new LinkedList<>();
14            q.add(i);
15            vis[i]=true;
16            int count=0,nodes=1;
17            while(!q.isEmpty()){
18                int cur=q.poll();
19                count+=map.get(cur).size();
20                for(int j:map.get(cur)){
21                    if(vis[j]) continue;
22                    nodes++;
23                    q.add(j);
24                    vis[j]=true;
25                }
26            }
27            if(count/2==nodes*(nodes-1)/2) c++;
28        }
29        return c;
30    }
31}