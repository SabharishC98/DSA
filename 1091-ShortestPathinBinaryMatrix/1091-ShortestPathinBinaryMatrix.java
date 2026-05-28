// Last updated: 5/29/2026, 12:00:22 AM
1class Solution {
2    public int shortestPathBinaryMatrix(int[][] grid) {
3        int n = grid.length, m = grid[0].length;
4        if (grid[0][0] == 1 || grid[n-1][m-1] == 1) return -1;
5        if (n == 1 && m == 1) return 1;
6        boolean[][] vis=new boolean[n][m];
7        Queue<int[]> q=new LinkedList<>();
8        q.add(new int[]{0,0,1});
9        vis[0][0]=true;
10        while(!q.isEmpty()){
11            int[] pos=q.poll();
12            int[][] dir={{1,0},{-1,0},{0,1},{0,-1},{-1,-1},{-1,1},{1,1},{1,-1}};
13            for(int[] i:dir){
14                int r=i[0]+pos[0];
15                int c=i[1]+pos[1];
16                if(r>=0 && r<n && c>=0 && c<m && !vis[r][c] && grid[r][c]==0){
17                    if(r==n-1 && c==m-1) return pos[2]+1;
18                    q.add(new int[]{r,c,pos[2]+1});
19                    vis[r][c]=true;
20                }
21            }
22        }
23        return -1;
24    }
25}