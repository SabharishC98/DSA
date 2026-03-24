// Last updated: 3/24/2026, 11:26:07 AM
class Solution {
    Set<Integer> ans=new HashSet<>();
    boolean[] vis;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        vis=new boolean[rooms.size()];
        dfs(0,rooms);
        return ans.size()==rooms.size();
    }
    public void dfs(int source,List<List<Integer>> rooms){
        vis[source]=true;
        ans.add(source);
        if(ans.size()==rooms.size()) return;
        for(int i=0;i<rooms.get(source).size();i++){
            if(vis[rooms.get(source).get(i)]==false){
                dfs(rooms.get(source).get(i),rooms);
            }
        }
    }
}