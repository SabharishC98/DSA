// Last updated: 7/20/2026, 10:25:54 AM
1class Solution {
2    public int minimumObstacles(int[][] grid) {
3        int m=grid.length,n=grid[0].length;
4        Deque<int[]> pq=new LinkedList<>();
5        int[][] dp=new int[m][n];
6        for(int[] row:dp) Arrays.fill(row,Integer.MAX_VALUE);
7        dp[0][0]=grid[0][0];
8        pq.add(new int[]{0,0});
9        int[][] dir=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
10        while(!pq.isEmpty()){
11            int[] temp=pq.poll();
12            for(int i[]:dir){
13                int nr=temp[0]+i[0];
14                int nc=temp[1]+i[1];
15                if(nr<0 || nr>=m || nc<0 || nc>=n) continue;
16                int w=grid[nr][nc];
17                if(dp[temp[0]][temp[1]]+w<dp[nr][nc]){
18                    dp[nr][nc]=dp[temp[0]][temp[1]]+w;
19                    if(w==0){
20                        pq.addFirst(new int[]{nr,nc});
21                    }
22                    else{
23                        pq.add(new int[]{nr,nc});
24                    }
25                }
26                
27            }
28        }
29        return dp[m-1][n-1];
30    }
31}