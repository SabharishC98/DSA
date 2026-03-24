// Last updated: 3/24/2026, 11:22:29 AM
class Solution {
    Map<Integer,List<Integer>> adj=new HashMap<>();
    boolean vis[];
    public long countPairs(int n, int[][] edges) {
        vis=new boolean[n];
        for(int i=0;i<edges.length;i++){
            adj.putIfAbsent(edges[i][0],new ArrayList<>());
            adj.putIfAbsent(edges[i][1],new ArrayList<>());
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        long ans=0;
        int size=n;
        for(int i=0;i<size;i++){
            if(!adj.containsKey(i)){
                vis[i]=true;
                ans+=(n-1);
                n--;
                continue;
            }
            if(vis[i]==false){
                long t=(dfs(i,0)+1);
                ans+=t*(n-t);
                n-=t;
            }
        }
        return ans;

    }

    public long dfs(int source,long count){
        vis[source]=true;
        long f=0;
        for(int i=0;i<adj.get(source).size();i++){
            if(vis[adj.get(source).get(i)]==false){
                f++;
                f+=dfs(adj.get(source).get(i),count+1);
            }
        }
        return f;
    }
}