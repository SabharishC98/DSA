// Last updated: 7/19/2026, 11:51:06 PM
1import java.util.*;
2
3class Solution {
4    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
5        int m=grid.size(),n=grid.get(0).size();
6        Deque<int[]> pq=new LinkedList<>();
7        int[][] dp=new int[m][n];
8        for(int[] row:dp) Arrays.fill(row,Integer.MAX_VALUE);
9        dp[0][0]=grid.get(0).get(0);
10        pq.add(new int[]{0,0});
11        int[][] dir=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
12        while(!pq.isEmpty()){
13            int[] temp=pq.poll();
14            for(int i[]:dir){
15                int nr=temp[0]+i[0];
16                int nc=temp[1]+i[1];
17                if(nr<0 || nr>=m || nc<0 || nc>=n) continue;
18                int w=grid.get(nr).get(nc);
19                if(dp[temp[0]][temp[1]]+w<dp[nr][nc]){
20                    dp[nr][nc]=dp[temp[0]][temp[1]]+w;
21                    if(w==0){
22                        pq.addFirst(new int[]{nr,nc});
23                    }
24                    else{
25                        pq.add(new int[]{nr,nc});
26                    }
27                }
28                
29            }
30        }
31        return dp[m-1][n-1]<health;
32    }
33}