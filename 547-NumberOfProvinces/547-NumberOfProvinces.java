// Last updated: 3/24/2026, 11:27:20 AM
class Solution {
    public int findCircleNum(int[][] is) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<is.length;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<is.length;j++){
                if(i!=j && is[i][j]==1){
                    temp.add(j);
                }
            }
            list.add(temp);
        }
        int count=0;
        int[] visited=new int[is.length];
        for(int i=0;i<is.length;i++){
            if(visited[i]==0){
                bfs(i,is.length,list,visited);
                count++;
            }
        }
        return count;
    }
    public void bfs(int st,int n,List<List<Integer>> list,int[] visited){
        visited[st]=1;
        Queue<Integer> q=new LinkedList<>();
        q.offer(st);
        while(!q.isEmpty()){
            int cur=q.poll();
            for(int i:list.get(cur)){
                if(visited[i]==0){
                    q.offer(i);
                    visited[i]=1;
                }
            }
        }
    }
}