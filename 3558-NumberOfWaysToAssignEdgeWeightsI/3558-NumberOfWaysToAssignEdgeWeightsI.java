// Last updated: 9/25/2026, 2:26:03 PM
class Solution {
    int max=Integer.MIN_VALUE;
    public int assignEdgeWeights(int[][] edges) {
        HashMap<Integer,List<Integer>> adj=new HashMap<>();
        for(int i[]:edges){
            adj.putIfAbsent(i[0],new ArrayList<>());
            adj.putIfAbsent(i[1],new ArrayList<>());
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);
        }
        HashMap<Integer,Boolean> vis=new HashMap<>();
        for(Integer i:adj.keySet()){
            Collections.sort(adj.get(i));
            vis.put(i,false);
        }
        dfs(1,0,adj,vis);
        // System.out.println(max);
        long ans = modPow(2, max - 1, 1000000007);
        return (int)(ans);
    }
    public void dfs(int i,int depth,HashMap<Integer,List<Integer>> adj,HashMap<Integer,Boolean> vis){
        vis.put(i,true);
        for(int j:adj.get(i)){
            if(!vis.get(j)){
                dfs(j,depth+1,adj,vis);
            }
        }
        max=Math.max(max,depth);
    }
    private long modPow(long base, long exp, long mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) result = result * base % mod;
            base = base * base % mod;
            exp >>= 1;
        }
        return result;
    }
}