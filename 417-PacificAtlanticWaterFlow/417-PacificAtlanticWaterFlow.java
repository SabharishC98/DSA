// Last updated: 5/27/2026, 12:41:29 AM
1class Solution {
2    
3    List<List<Integer>> ans=new ArrayList<>();
4    public List<List<Integer>> pacificAtlantic(int[][] heights) {
5        boolean[][] vis=new boolean[heights.length][heights[0].length];
6        boolean[][] vis1=new boolean[heights.length][heights[0].length];
7        for(int i=0;i<heights.length;i++){
8            for(int j=0;j<heights[0].length;j++){
9                if(i==0 || j==0){
10                    dfs(heights,i,j,vis);
11                }
12                if(j==heights[0].length-1 || i==heights.length-1){
13                    dfs(heights,i,j,vis1);
14                }
15            }
16        }
17        for(int i=0;i<heights.length;i++){
18            for(int j=0;j<heights[0].length;j++){
19                if(vis[i][j] && vis1[i][j]){
20                    List<Integer> temp=new ArrayList<>();
21                    temp.add(i);
22                    temp.add(j);
23                    ans.add(temp);
24                }
25            }
26        }
27        
28        
29        return ans;
30    }
31    public void dfs(int[][] heights,int r,int c,boolean[][] vis){
32        vis[r][c]=true;
33        
34        int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
35        for(int i[]:dir){
36            int nr=r+i[0];
37            int nc=c+i[1];
38            if(nr>=0 && nr<heights.length && nc>=0 && nc<heights[0].length && heights[nr][nc]>=heights[r][c] && !vis[nr][nc]){
39                dfs(heights,nr,nc,vis);
40            }
41        }
42    }
43}