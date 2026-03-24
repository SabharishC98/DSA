// Last updated: 3/24/2026, 11:23:15 AM
class Solution {
    static List<List<Integer>> adj;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[] vis=new boolean[n];
        return dfs(source,vis,destination);
    }
    public boolean dfs(int source,boolean[] vis,int destination){
        vis[source]=true;
        if(source==destination) return true;
        for(int i:adj.get(source)){
            if(!vis[i]){
            if(dfs(i,vis,destination)) return true;}
        }
        return false;
    }
}