// Last updated: 9/25/2026, 2:30:25 PM
class Solution {
    int max=Integer.MIN_VALUE;
    public int maxStarSum(int[] vals, int[][] edges, int k) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<vals.length;i++){
            map.put(i,new ArrayList<>());
        }
        
        for(int[] i:edges){
            map.get(i[0]).add(vals[i[1]]);
            map.get(i[1]).add(vals[i[0]]);
        }
        for(int i:map.keySet()){
            // if(vals[i]<0) continue;
            Collections.sort(map.get(i),Collections.reverseOrder());
            int s=vals[i],c=0;
            max=Math.max(max,s);
            for(int j:map.get(i)){
                if(j<=0 || c==k) break;
                s+=j;
                c++;
                if(s!=0)
                max=Math.max(max,s);
            }
            
            // System.out.println(i+" "+map.get(i)+" "+s+" "+k+" "+max);
        }
        return max;
    }
}