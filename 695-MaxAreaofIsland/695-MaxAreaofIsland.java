// Last updated: 4/26/2026, 4:52:12 PM
1class Solution {
2    int[][] memo;
3    int m,n;
4    public int longestIncreasingPath(int[][] matrix) {
5        m=matrix.length;
6        n=matrix[0].length;
7        memo=new int[m][n];
8        for(int i=0;i<m;i++)
9        Arrays.fill(memo[i],-1);
10        int longest=1;
11        for(int i=0;i<m;i++){
12            for(int j=0;j<n;j++){
13                if(memo[i][j]==-1){
14                    memo[i][j]=dfs(matrix,i,j);
15                }
16                longest=Math.max(longest,memo[i][j]);
17            }
18        }
19        return longest;
20    }
21    public int dfs(int[][] matrix,int x,int y){
22        if(memo[x][y]!=-1) return memo[x][y];
23        int max=0;
24        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
25        for(int[] i:dir){
26            int newx=i[0]+x;
27            int newy=i[1]+y;
28            if(newx<0 || newy<0 || newx>=m || newy>=n) continue;
29            if(matrix[x][y]<matrix[newx][newy]){
30                if(memo[newx][newy]==-1){
31                    memo[newx][newy]=dfs(matrix,newx,newy);
32                }
33                max=Math.max(max,memo[newx][newy]);
34            }
35        }
36        return max+1;
37    }
38}