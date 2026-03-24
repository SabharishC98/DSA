// Last updated: 3/24/2026, 11:23:48 AM
class Solution {
    Map<Integer,List<Integer>> adj=new HashMap<>();
    Map<Integer,Boolean> vis=new HashMap<>();
    int[] arr;
    int j=0;
    public int[] restoreArray(int[][] adjacentPairs) {
        int min=0;
        LinkedHashMap<Integer,Integer> count=new LinkedHashMap<>();
        for(int i[]:adjacentPairs){
            count.put(i[0],count.getOrDefault(i[0],0)+1);
            count.put(i[1],count.getOrDefault(i[1],0)+1);
            adj.putIfAbsent(i[0],new ArrayList<>());
            adj.get(i[0]).add(i[1]);
            adj.putIfAbsent(i[1],new ArrayList<>());
            adj.get(i[1]).add(i[0]);
        }
        for(int i:count.keySet()){
            if(count.get(i)==1){
                min=i;
                break;
            }
        }
        arr=new int[adj.size()];
        if(adj.size()==0) return arr;
        dfs(min);
        return arr;
    }
    public void dfs(int i){
        vis.put(i,true);
        arr[j++]=i;
        for(int k:adj.get(i)){
            if(!vis.containsKey(k)) dfs(k);
        }
    }
}