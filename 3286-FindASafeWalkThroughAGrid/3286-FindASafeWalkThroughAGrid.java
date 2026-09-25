// Last updated: 9/25/2026, 2:26:48 PM
import java.util.*;

class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m=grid.size(),n=grid.get(0).size();
        Deque<int[]> pq=new LinkedList<>();
        int[][] dp=new int[m][n];
        for(int[] row:dp) Arrays.fill(row,Integer.MAX_VALUE);
        dp[0][0]=grid.get(0).get(0);
        pq.add(new int[]{0,0});
        int[][] dir=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        while(!pq.isEmpty()){
            int[] temp=pq.poll();
            for(int i[]:dir){
                int nr=temp[0]+i[0];
                int nc=temp[1]+i[1];
                if(nr<0 || nr>=m || nc<0 || nc>=n) continue;
                int w=grid.get(nr).get(nc);
                if(dp[temp[0]][temp[1]]+w<dp[nr][nc]){
                    dp[nr][nc]=dp[temp[0]][temp[1]]+w;
                    if(w==0){
                        pq.addFirst(new int[]{nr,nc});
                    }
                    else{
                        pq.add(new int[]{nr,nc});
                    }
                }
                
            }
        }
        return dp[m-1][n-1]<health;
    }
}