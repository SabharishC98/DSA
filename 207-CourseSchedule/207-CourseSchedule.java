// Last updated: 3/24/2026, 11:29:30 AM
class Solution {
    HashMap<Integer,List<Integer>> map;
    static HashMap<Integer,Boolean> vis;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        map=new HashMap<>();
        vis=new HashMap<>();
        for(int[] i:prerequisites){
            map.putIfAbsent(i[0],new ArrayList<>());
            map.get(i[0]).add(i[1]);
            vis.put(i[0],false);
            vis.put(i[1],false);
        }
        for(int i:map.keySet()){
            if(dfs(i)==false) return false;
        }
        return true;
    }
    public boolean dfs(int source){
        if(vis.get(source)) return false;
        if(map.get(source).size()==0) return true;
        vis.put(source,true);
        for(int i:map.get(source)){
            if(map.containsKey(i) && dfs(i)==false) return false;
        }
        vis.put(source,false);
        map.put(source,new ArrayList<>());
        return true;
    }
}