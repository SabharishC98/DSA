// Last updated: 9/25/2026, 2:29:16 PM
class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++) map.putIfAbsent(i,new ArrayList<>());
        for(int i[]:edges){
            map.get(i[0]).add(i[1]);
            map.get(i[1]).add(i[0]);
        }
        int c=0;
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            if(vis[i]) continue;
            Queue<Integer> q=new LinkedList<>();
            q.add(i);
            vis[i]=true;
            int count=0,nodes=1;
            while(!q.isEmpty()){
                int cur=q.poll();
                count+=map.get(cur).size();
                for(int j:map.get(cur)){
                    if(vis[j]) continue;
                    nodes++;
                    q.add(j);
                    vis[j]=true;
                }
            }
            if(count/2==nodes*(nodes-1)/2) c++;
        }
        return c;
    }
}