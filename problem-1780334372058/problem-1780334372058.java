// Last updated: 6/1/2026, 10:49:32 PM
1class Solution {
2    public boolean possibleBipartition(int n, int[][] dislikes) {
3        Map<Integer,List<Integer>> map=new HashMap<>();
4        for(int i=1;i<=n;i++){
5            map.put(i,new ArrayList<>());
6        }
7        for(int[] i:dislikes){
8            map.get(i[0]).add(i[1]);
9            map.get(i[1]).add(i[0]);
10        }
11        int[] color=new int[n+1];
12        Queue<Integer> q=new LinkedList<>();
13        for(int i=1;i<=n;i++){
14            if(color[i]!=0) continue;
15            q.add(i);
16            color[i]=1;
17            while(!q.isEmpty()){
18                int cur=q.poll();
19                for(int j:map.get(cur)){
20                    if(color[j]==0){
21                        if(color[cur]==1) color[j]=2;
22                        else if(color[cur]==2) color[j]=1;
23                        q.add(j);
24                    }
25                    else if(color[j]==color[cur]) return false;
26                }
27            }
28        }
29        return true;
30    }
31}