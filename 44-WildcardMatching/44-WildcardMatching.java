// Last updated: 7/30/2026, 12:04:15 PM
1class Solution {
2    Map<String,List<Map<String,Double>>> map;
3    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
4        map=new HashMap<>();
5        for(int i=0;i<equations.size();i++){
6            String s1=equations.get(i).get(0);
7            String s2=equations.get(i).get(1);
8            map.putIfAbsent(s1,new ArrayList<>());
9            map.putIfAbsent(s2,new ArrayList<>());
10            Map<String,Double> temp=new HashMap<>();
11            temp.put(s2,values[i]);
12            map.get(s1).add(temp);
13            temp=new HashMap<>();
14            temp.put(s1,1.0/values[i]);
15            map.get(s2).add(temp);
16        }
17        // System.out.println(map);
18        double[] ans=new double[queries.size()];
19        for(int i=0;i<queries.size();i++){
20            ans[i]=process(queries.get(i));
21        }
22        return ans;
23    }
24    public double process(List<String> node){
25        String src=node.get(0);
26        String dst=node.get(1);
27        if(!map.containsKey(src) || !map.containsKey(dst)) return -1.0;
28        Queue<Map<String,Double>> q=new LinkedList<>();
29        Map<String,Boolean> vis=new HashMap<>();
30        Map<String,Double> temp=new HashMap<>();
31        temp.put(src,1.0);
32        q.add(temp);
33        vis.put(src,true);
34        while(!q.isEmpty()){
35            Map<String,Double> cur=q.poll();
36            String cur_node=null;
37            for(String i:cur.keySet()){
38                cur_node=i;
39            }
40            if(cur_node.equals(dst)) return cur.get(cur_node);
41            if(!map.containsKey(cur_node)) continue;
42            for(Map<String,Double> i:map.get(cur_node)){
43                String nei=null;
44                for(String j:i.keySet()){
45                    nei=j;
46                }
47                if(vis.containsKey(nei)){
48                    continue;
49                }
50                vis.put(nei,true);
51                Map<String,Double> nei_temp=new HashMap<>();
52                nei_temp.put(nei,cur.get(cur_node)*i.get(nei));
53                
54                q.add(nei_temp);
55            }
56        }
57        return -1.0;
58    }
59}