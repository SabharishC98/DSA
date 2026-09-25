// Last updated: 9/25/2026, 2:42:35 PM
class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=1;i<=n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int[] i:dislikes){
            map.get(i[0]).add(i[1]);
            map.get(i[1]).add(i[0]);
        }
        int[] color=new int[n+1];
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            if(color[i]!=0) continue;
            q.add(i);
            color[i]=1;
            while(!q.isEmpty()){
                int cur=q.poll();
                for(int j:map.get(cur)){
                    if(color[j]==0){
                        if(color[cur]==1) color[j]=2;
                        else if(color[cur]==2) color[j]=1;
                        q.add(j);
                    }
                    else if(color[j]==color[cur]) return false;
                }
            }
        }
        return true;
    }
}