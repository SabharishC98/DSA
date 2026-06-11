// Last updated: 6/11/2026, 11:43:13 AM
1class Solution {
2    int max=Integer.MIN_VALUE;
3    public int assignEdgeWeights(int[][] edges) {
4        HashMap<Integer,List<Integer>> adj=new HashMap<>();
5        for(int i[]:edges){
6            adj.putIfAbsent(i[0],new ArrayList<>());
7            adj.putIfAbsent(i[1],new ArrayList<>());
8            adj.get(i[0]).add(i[1]);
9            adj.get(i[1]).add(i[0]);
10        }
11        HashMap<Integer,Boolean> vis=new HashMap<>();
12        for(Integer i:adj.keySet()){
13            Collections.sort(adj.get(i));
14            vis.put(i,false);
15        }
16        dfs(1,0,adj,vis);
17        // System.out.println(max);
18        long ans = modPow(2, max - 1, 1000000007);
19        return (int)(ans);
20    }
21    public void dfs(int i,int depth,HashMap<Integer,List<Integer>> adj,HashMap<Integer,Boolean> vis){
22        vis.put(i,true);
23        for(int j:adj.get(i)){
24            if(!vis.get(j)){
25                dfs(j,depth+1,adj,vis);
26            }
27        }
28        max=Math.max(max,depth);
29    }
30    private long modPow(long base, long exp, long mod) {
31        long result = 1;
32        base %= mod;
33        while (exp > 0) {
34            if ((exp & 1) == 1) result = result * base % mod;
35            base = base * base % mod;
36            exp >>= 1;
37        }
38        return result;
39    }
40}