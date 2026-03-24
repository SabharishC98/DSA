// Last updated: 3/24/2026, 11:26:16 AM
class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    boolean[] vis;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        vis=new boolean[graph.length];
        List<Integer> temp=new ArrayList<>();
        temp.add(0);
        vis[0]=true;
        back(0,temp,graph);
        return ans;
    }
    public void back(int source,List<Integer> temp,int[][] graph){
        
        if(source==graph.length-1){ ans.add(new ArrayList<>(temp));  return;}
        for(int i=0;i<graph[source].length;i++){
            if(vis[graph[source][i]]==false){
                temp.add(graph[source][i]);
                vis[graph[source][i]]=true;
                back(graph[source][i],temp,graph);
                temp.remove(temp.size()-1);
                vis[graph[source][i]]=false;
            }
        }
        
    }
}