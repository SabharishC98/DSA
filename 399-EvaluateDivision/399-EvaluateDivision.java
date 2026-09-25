// Last updated: 9/25/2026, 2:48:10 PM
class Solution {
    Map<String,List<Map<String,Double>>> map;
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        map=new HashMap<>();
        for(int i=0;i<equations.size();i++){
            String s1=equations.get(i).get(0);
            String s2=equations.get(i).get(1);
            map.putIfAbsent(s1,new ArrayList<>());
            map.putIfAbsent(s2,new ArrayList<>());
            Map<String,Double> temp=new HashMap<>();
            temp.put(s2,values[i]);
            map.get(s1).add(temp);
            temp=new HashMap<>();
            temp.put(s1,1.0/values[i]);
            map.get(s2).add(temp);
        }
        // System.out.println(map);
        double[] ans=new double[queries.size()];
        for(int i=0;i<queries.size();i++){
            ans[i]=process(queries.get(i));
        }
        return ans;
    }
    public double process(List<String> node){
        String src=node.get(0);
        String dst=node.get(1);
        if(!map.containsKey(src) || !map.containsKey(dst)) return -1.0;
        Queue<Map<String,Double>> q=new LinkedList<>();
        Map<String,Boolean> vis=new HashMap<>();
        Map<String,Double> temp=new HashMap<>();
        temp.put(src,1.0);
        q.add(temp);
        vis.put(src,true);
        while(!q.isEmpty()){
            Map<String,Double> cur=q.poll();
            String cur_node=null;
            for(String i:cur.keySet()){
                cur_node=i;
            }
            if(cur_node.equals(dst)) return cur.get(cur_node);
            if(!map.containsKey(cur_node)) continue;
            for(Map<String,Double> i:map.get(cur_node)){
                String nei=null;
                for(String j:i.keySet()){
                    nei=j;
                }
                if(vis.containsKey(nei)){
                    continue;
                }
                vis.put(nei,true);
                Map<String,Double> nei_temp=new HashMap<>();
                nei_temp.put(nei,cur.get(cur_node)*i.get(nei));
                
                q.add(nei_temp);
            }
        }
        return -1.0;
    }
}