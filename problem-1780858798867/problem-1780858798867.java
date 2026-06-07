// Last updated: 6/8/2026, 12:29:58 AM
1class Solution {
2    int max=Integer.MIN_VALUE;
3    public int maxStarSum(int[] vals, int[][] edges, int k) {
4        Map<Integer,List<Integer>> map=new HashMap<>();
5        for(int i=0;i<vals.length;i++){
6            map.put(i,new ArrayList<>());
7        }
8        
9        for(int[] i:edges){
10            map.get(i[0]).add(vals[i[1]]);
11            map.get(i[1]).add(vals[i[0]]);
12        }
13        for(int i:map.keySet()){
14            // if(vals[i]<0) continue;
15            Collections.sort(map.get(i),Collections.reverseOrder());
16            int s=vals[i],c=0;
17            max=Math.max(max,s);
18            for(int j:map.get(i)){
19                if(j<=0 || c==k) break;
20                s+=j;
21                c++;
22                if(s!=0)
23                max=Math.max(max,s);
24            }
25            
26            // System.out.println(i+" "+map.get(i)+" "+s+" "+k+" "+max);
27        }
28        return max;
29    }
30}