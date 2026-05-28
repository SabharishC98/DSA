// Last updated: 5/29/2026, 1:38:06 AM
1class Solution {
2    public int reachableNodes(int n, int[][] edges, int[] restricted) {
3        Set<Integer> res=new HashSet<>();
4        for(int i:restricted){
5            res.add(i);
6        }
7        Map<Integer,List<Integer>> map=new HashMap<>();
8        for(int i=0;i<n;i++) map.putIfAbsent(i,new ArrayList<>());
9        for(int i[]:edges){
10            map.get(i[0]).add(i[1]);
11            map.get(i[1]).add(i[0]);
12        }
13
14        boolean vis[]=new boolean[n];
15        Queue<Integer> q=new LinkedList<>();
16        q.add(0);
17        vis[0]=true;
18        int c=1;
19        while(!q.isEmpty()){
20            int cur=q.poll();
21            for(int i:map.get(cur)){
22                if(vis[i] || res.contains(i)) continue;
23                c++;
24                vis[i]=true;
25                q.add(i);
26            }
27        }
28        return c;
29    }
30}